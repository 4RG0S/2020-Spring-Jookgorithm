import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int P, V;
        P = Integer.parseInt(tokens[0]);
        V = Integer.parseInt(tokens[1]);

        int sumVoted = 0;
        int sumOfElectionParty = 0;
        List<Party> parties = new ArrayList<>();

        parties.add(new Party(0));
        for(int i = 1; i <= P; i++) {
            input = br.readLine();
            tokens = input.split(" ");

            String partyName = tokens[0];
            int r = Integer.parseInt(tokens[1]);
            int voted = Integer.parseInt(tokens[2]);

            parties.add(new Party(i, partyName, r, voted));
            sumVoted += voted;
            sumOfElectionParty += r;
        }
        parties.get(0).partyName = "None";
        parties.get(0).r = 253 - sumOfElectionParty;
        parties.get(0).p = -1;

        // 무효표를 제하고 득표율 계산
        // 의석할당정당인지 판단
        List<Integer> tmp = calculatePAndAllocatable(parties, sumVoted);
        int sumOfAllocatableVoted = tmp.get(0);
        int R = tmp.get(1);

        // 비례득표율 p계산
        // 연동배분 의석 수 s 계산
        int sumS = calculateS(parties, sumOfAllocatableVoted, R);

        // 연동배분의석수 30으로 재분배
        // 나머지와 id로 정렬 후 30석 까지 분배
        sumS = scalingS(parties, sumS);
        sortByRedundant(parties);
        sumS = distributeSeat(parties, sumS, "s");

        // 17석 나눠먹기
        int sumT = calculateT(parties);

        // 나머지와 id로 정렬 후 17석 까지 분배
        sortByRedundant(parties);
        distributeSeat(parties, sumT, "t");

        // 의석수 계산, 정렬
        for (Party p : parties)
            p.sumOfSeat = p.r + p.s + p.t;
        sortBySeat(parties);

        // 출력
        for (Party p : parties) {
            if (p.i == 0) continue;
            System.out.println(p.partyName + " " + p.sumOfSeat);
        }

    }

    public static List<Integer> calculatePAndAllocatable(List<Party> parties, int sumVoted) {
        int sumOfAllocatableVoted = 0;
        int R = parties.get(0).r;
        for(int i = 1; i < parties.size(); i++) {
            Party p = parties.get(i);
            p.votedRate = p.voted*1.0 / sumVoted;
            if(!isAllocatableParty(p)) {
                p.p = -1;
                R += p.r;
            }
            else sumOfAllocatableVoted += p.voted;
        }

        List<Integer> ret = new ArrayList<>();
        ret.add(sumOfAllocatableVoted);
        ret.add(R);
        return ret;
    }

    public static int calculateS(List<Party> parties, int sumOfAllocatableVoted, int R) {
        int sumS = 0;
        for(int i = 1; i < parties.size(); i++) {
            Party p = parties.get(i);
            if(p.p != -1) {
                p.p = p.voted * 1.0 / sumOfAllocatableVoted;

                double tmp_s = ((300-R)*1.0 * p.p - p.r)/2;
                if(tmp_s < 1) p.s = 0;
                else p.s = (int) Math.round(tmp_s);
                sumS += p.s;
            }
        }
        return sumS;
    }

    public static int calculateT(List<Party> parties) {
        int sumT = 0;
        for (Party p : parties) {
            if (p.p != -1) {
                double tmp_t = 17.0 * p.p;
                p.t = (int) tmp_t;
                p.redundant = tmp_t - ((int) tmp_t);
                sumT += p.t;
            }
        }
        return sumT;
    }

    public static int scalingS(List<Party> parties, int sumS) {
        int newSum = 0;
        if(sumS > 30) {
            for(int i = 1; i < parties.size(); i++) {
                Party p = parties.get(i);

                double tmp_s = 30*p.s*1.0/sumS;
                p.s = (int) tmp_s;
                p.redundant = tmp_s - ((int) tmp_s);
                newSum += p.s;
            }
        }
        else if(sumS < 30) {
            for(int i = 1; i < parties.size(); i++) {
                Party p = parties.get(i);

                double tmp_s = p.s + ((30 - sumS)*1.0 * p.p);
                p.s = (int) tmp_s;
                p.redundant = tmp_s - ((int) tmp_s);
                newSum += p.s;
            }
        }

        return newSum;
    }

    public static int distributeSeat(List<Party> parties, int sum, String mode) {
        if(mode.equals("s")) {
            for(int i = 0; sum < 30; i++) {
                if(i == parties.size()) i = 0;
                Party p = parties.get(i);
                if(p.p != -1) {
                    p.s++;
                    sum++;
                }
            }
            return sum;
        }
        else if(mode.equals("t")) {
            for(int i = 0; sum < 17; i++) {
                if(i == parties.size()) i = 0;
                Party p = parties.get(i);
                if(p.p != -1) {
                    p.t++;
                    sum++;
                }
            }
            return sum;
        }

        return -1;
    }

    public static void sortBySeat(List<Party> parties) {
        parties.sort((Party o1, Party o2) -> {
            if (o1.sumOfSeat < o2.sumOfSeat)
                return 1;
            else if (o1.sumOfSeat > o2.sumOfSeat)
                return -1;
            else {
                if (o1.partyName.compareTo(o2.partyName) > 0)
                    return 1;
                else
                    return -1;
            }
        });
    }

    public static void sortByRedundant(List<Party> parties) {
        parties.sort((Party o1, Party o2) -> {
            if (o1.redundant > o2.redundant)
                return -1;
            else if (o1.redundant < o2.redundant)
                return 1;
            else {
                if (o1.i > o2.i)
                    return 1;
                else
                    return -1;
            }
        });
    }

    public static boolean isAllocatableParty(Party party) {
        return party.r >= 5 || party.votedRate >= 0.03;
    }

    public static class Party {
        String partyName;

        int i;
        int r;
        int voted;
        int s;
        int t;
        int sumOfSeat;

        double p;
        double votedRate;
        double redundant;

        Party(int i) {
            this.i = i;
        }

        Party(int i, String partyName, int r, int voted) {
            this.i = i;
            this.partyName = partyName;
            this.r = r;
            this.voted = voted;
        }

    }

}
