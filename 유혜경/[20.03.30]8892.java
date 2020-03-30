import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int cnt = 0;
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            String[] str = new String[n];
            cnt=0;
            for(int j = 0; j < n; j++)
                str[j] = scanner.next();
            for(int a = 0; a < n; a++) {
                for(int b = 0; b <n; b++) {
                    if(a!=b) {
                        String s = str[a] + str[b];
                        if (isPalindrome(s)) {
                            System.out.println(s);
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt!=0)
                    break;
            }
            if(cnt==0)
                System.out.println(0);
        }
    }
    public static boolean isPalindrome(String s){
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i<j){
            if(chars[i]!=chars[j])
                return false;
            i++; j--;
        }
        return true;
    }
}