import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int n, m;
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        List<Guitar> guitars = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            input = br.readLine();
            tokens = input.split(" ");

            guitars.add(new Guitar(tokens[0], tokens[1], m));
        }

        System.out.println(Guitar.leastGuitar(guitars));

    }

    public static class Guitar {
        String name;
        boolean[] songs;

        private static boolean[] best;
        private static int bestCnt;

        Guitar(String name, String songs, int songsCnt) {
            this.name = name;
            this.songs = new boolean[songsCnt];

            for(int i = 0; i < songs.length(); i++) {
                String str = songs.substring(i, i+1);
                if(str.equals("Y")) this.songs[i] = true;
                else                this.songs[i] = false;
            }

        }

        public static int leastGuitar(List<Guitar> guitars) {
            int arrayLen = guitars.get(0).songs.length;
            best = new boolean[arrayLen];
            leastGuitar(guitars, new boolean[arrayLen], 0, 0);
            if(trueCount(best) == 0)
                return -1;
            return bestCnt;
        }

        private static void leastGuitar(List<Guitar> guitars, boolean[] possibles, int idx, int cnt) {

            if(idx == guitars.size()) {
                int bestTrueCnt = trueCount(best);
                int currentTrueCnt = trueCount(possibles);
                if(bestTrueCnt < currentTrueCnt) {
                    best = possibles.clone();
                    bestCnt = cnt;
                }
                else if(bestTrueCnt == currentTrueCnt)
                    bestCnt = Math.min(bestCnt, cnt);
            }
            else {
                leastGuitar(guitars, possibles, idx + 1, cnt);

                boolean[] tmp = possibles.clone();
                for(int i = 0; i < possibles.length; i++)
                    possibles[i] = possibles[i] | guitars.get(idx).songs[i];
                leastGuitar(guitars, possibles, idx + 1, cnt + 1);

                for(int i = 0; i < possibles.length; i++)
                    possibles[i] = tmp[i];
            }

        }

        private static int trueCount(boolean[] arr) {
            int cnt = 0;
            for(int i = 0; i < arr.length; i++)
                cnt = arr[i] ? cnt + 1 : cnt;
            return cnt;
        }

    }

}
