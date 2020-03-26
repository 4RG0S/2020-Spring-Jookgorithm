import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        int min = 0;
        if(isPalindrome(string)) System.out.println(arr.length);
        else {
            for (int i = 0; i < arr.length; i++) {
                String s = string;
                for(int j = i; j >= 0; j--)
                    s += arr[j];
                if(isPalindrome(s)) {
                    System.out.println(s.length());
                    break;
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        char[] chars = str.toCharArray();
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