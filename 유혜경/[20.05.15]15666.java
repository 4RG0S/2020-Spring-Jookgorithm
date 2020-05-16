import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    static StringBuilder str = new StringBuilder();
    static int[] arr;
    static int[] seq;
    static LinkedHashSet<String> hashSet = new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        arr = new int[n+1];
        seq = new int[n+1];
        for(int i = 1; i <= n; i++)
            seq[i] = scanner.nextInt();
        Arrays.sort(seq);
        dfs(n,m,0);
        Iterator it = hashSet.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
    private static void dfs(int n, int m, int cnt){
        if(cnt == m){
            int[] copy1 = new int[m];
            int[] copy2 = new int[m];
            System.arraycopy(arr,0,copy1,0,m);
            System.arraycopy(arr,0,copy2,0,m);
            Arrays.sort(copy1);
            if(!Arrays.equals(copy1,copy2)) return;
            for(int i = 0; i < cnt; i++)
               str.append(arr[i]+" ");
            str.append("\n");
            hashSet.add(str.toString());
            str.setLength(0);
            return;
        }
        for(int i = 1; i <= n; i++){
            arr[cnt] = seq[i];
            dfs(n,m,cnt+1);
        }
        return ;
    }
}