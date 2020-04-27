import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] parent;
    static boolean[] isLeaf;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        parent = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = scan.nextInt();
        }
        int remove = scan.nextInt();
        parent[remove] = -2;
        isLeaf = new boolean[n];

        Arrays.fill(isLeaf, true);

        for(int i=0;i<n;i++){
            if(!isLeaf[i]) continue;
            else isLeafNode(i);
        }
        int answer = 0;
        for(int i=0;i<n;i++){
            if(isLeaf[i]) answer++;
        }
        System.out.println(answer);
    }
    public static int myFirstParent(int i){
        if(i == -2) return -2;
        else if(i == -1) return -1;
        else {
            return myFirstParent(parent[i]);
        }
    }
    public static void isLeafNode(int i){
        if(myFirstParent(i) == -2) {isLeaf[i] = false; return;}
        if(parent[i] != -1){
            isLeaf[parent[i]] = false;
            isLeafNode(parent[i]);
        }
    }
}
