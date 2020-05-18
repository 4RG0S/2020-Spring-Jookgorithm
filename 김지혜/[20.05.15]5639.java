import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static class Node{
        Node left;
        Node right;
        int value;

        public Node(Node left, Node right, int value){
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        Node root = null;
        while(scan.hasNextLine()){
            String input = scan.nextLine();
            if(input.equals("")) break;

            int inputN = Integer.parseInt(input);

            if(root == null){
                root = new Node(null, null, inputN);
                continue;
            }
            Node p = root;
            while(p!=null){
                if(p.value > inputN){
                    if(p.left == null) {
                        p.left = new Node(null, null, inputN);
                        break;
                    }
                    else p = p.left;
                }
                else{
                    if(p.right == null) {
                        p.right = new Node(null, null, inputN);
                        break;
                    }
                    else p = p.right;
                }
            }
        }
        pOrder(root);
    }
    public static void pOrder(Node p){
        if(p.left!=null){
            pOrder(p.left);
        }
        if(p.right!=null){
            pOrder(p.right);
        }
        System.out.println(p.value);
    }




}
