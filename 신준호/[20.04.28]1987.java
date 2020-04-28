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

        int r, c;
        r = Integer.parseInt(tokens[0]);
        c = Integer.parseInt(tokens[1]);

        int[][] board = new int[r][c];
        for (int i = 0; i < r; i++) {
            input = br.readLine();
            for (int j = 0; j < input.length(); j++)
                board[i][j] = input.charAt(j);
        }

        System.out.println(maxMovCnt(board, new boolean[r][c], 0, new ArrayList<Integer>(), 0, 0));

    }

    public static int maxMovCnt(int[][] board, boolean[][] stepped, int cnt, List<Integer> alphabetList, int currentRow, int currentCol) {

        if (alphabetList.contains(board[currentRow][currentCol]))
            return cnt;

        cnt++;
        stepped[currentRow][currentCol] = true;
        alphabetList.add(board[currentRow][currentCol]);

        int max = 0;
        // up
        if (currentRow > 0)
            if (!stepped[currentRow - 1][currentCol])
                max = Math.max(max, maxMovCnt(board, stepped, cnt, alphabetList, currentRow - 1, currentCol));
        //down
        if (currentRow < board.length - 1)
            if (!stepped[currentRow + 1][currentCol])
                max = Math.max(max, maxMovCnt(board, stepped, cnt, alphabetList, currentRow + 1, currentCol));
        //left
        if (currentCol > 0)
            if (!stepped[currentRow][currentCol - 1])
                max = Math.max(max, maxMovCnt(board, stepped, cnt, alphabetList, currentRow, currentCol - 1));

        //right
        if (currentCol < board[0].length - 1)
            if (!stepped[currentRow][currentCol + 1])
                max = Math.max(max, maxMovCnt(board, stepped, cnt, alphabetList, currentRow, currentCol + 1));

        stepped[currentRow][currentCol] = false;
        alphabetList.remove(alphabetList.size() - 1);
        return Math.max(max, cnt);

    }

}
