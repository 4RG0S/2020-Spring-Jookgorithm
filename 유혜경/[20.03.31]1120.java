import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        System.out.println(findmin(s[0],s[1],s[1].length()-s[0].length()));
    }
    public static int findmin(String s1, String s2, int dif){
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for(int j = 0; j <= dif; j++){
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i)!=(s2.charAt(i+j)))
                    cnt++;
            }
            min = Math.min(cnt, min);
            cnt = 0;
        }
        return min;
    }
}