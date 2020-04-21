import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            Stack<Character> fronts = new Stack<>();
            Stack<Character> rears = new Stack<>();
            String str = br.readLine();

            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                if(c == '<' && !fronts.empty()) rears.push(fronts.pop());
                else if(c == '>' && !rears.empty()) fronts.push(rears.pop());
                else if(c == '-' && !fronts.empty()) fronts.pop();
                else if(c != '<' &&c != '>' &&c != '-') fronts.push(c);
            }
            while(!fronts.empty()) rears.push(fronts.pop());
            while(!rears.empty()) bw.write(rears.pop());
            bw.write("\n");
        }
        br.close();
        bw.flush();

    }
}
