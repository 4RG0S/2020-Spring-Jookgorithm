import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        //input = br.readLine();
        //tokens = input.split(" ");

        int n = Integer.parseInt(br.readLine());
        input = br.readLine();
        tokens = input.split(" ");

        Node[] nodes = new Node[n];
        Node root = null;
        for(int i = 0; i < n; i++)
            nodes[i] = new Node(i);

        for(int i = 0; i < n; i++) {
            int parent = Integer.parseInt(tokens[i]);

            if(parent == -1) {
                root = nodes[i];
            }
            else {
                nodes[parent].childs.add(nodes[i]);
                nodes[i].parent = nodes[parent];
            }
        }

        int cut = Integer.parseInt(br.readLine());
        if(cut == root.id)
            System.out.println("0");
        else {
            nodes[cut].parent.childs.remove(nodes[cut]);
            System.out.println(root.leafCount());
        }

    }

    public static class Node {
        int id;
        List<Node> childs;
        Node parent;

        public Node(int id) {
            this.id = id;
            this.childs = new ArrayList<>();
        }

        public int leafCount() {
            if(childs.isEmpty()) return 1;
            else {
                int count = 0;
                for(int i = 0; i < childs.size(); i++)
                    count += childs.get(i).leafCount();
                return count;
            }
        }

    }

}