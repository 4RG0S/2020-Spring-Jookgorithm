import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        String t = scanner.nextLine();
        String p = scanner.nextLine();
        char[] target = t.toCharArray();
        char[] pattern = p.toCharArray();
        int[] pi = getPi(p);
        int j = 0, cnt = 0;
        for(int i = 0; i < t.length(); i++){
            while(j > 0 && target[i] != pattern[j])
                j = pi[j-1];
            if(target[i] == pattern[j]){
                if(j == pattern.length-1){
                    cnt++;
                    list.add(i - j + 1);
                    j = pi[j];
                }
                else
                    j++;
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i)+" ");
        System.out.println();
    }
    public static int[] getPi(String pattern){
        int m = pattern.length();
        int j = 0;
        char[] p = new char[m];
        int[] pi = new int[m];

        p = pattern.toCharArray();

        for(int i = 1; i < m; i++){
            while(j > 0 && p[i] != p[j]){
                j = pi[j-1];
            }
            if(p[i]==p[j])
                pi[i] = ++j;
        }
        return pi;
    }
}