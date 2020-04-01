import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] tokens;

        input = br.readLine();
        tokens = input.split(" ");

        int n, m;
        m = Integer.parseInt(tokens[0]);
        n = Integer.parseInt(tokens[1]);

        int[][] map = new int[m][n];
        for(int i = 0; i < m; i++) {
            input = br.readLine();
            tokens = input.split(" ");
            for(int j = 0; j < n; j++)
                map[i][j] = Integer.parseInt(tokens[j]);
        }

        dp = new long[m+1][n+1];
        for(long[] row : dp)
            Arrays.fill(row, -1);
        System.out.println(pathFind(map, 0, 0));
    }

    public static long pathFind(int[][] map, int y, int x) {
        long path = 0;
        if (y == map.length - 1 && x == map[0].length - 1) return 1;
        if (dp[y][x] != -1) return dp[y][x];

        if (y != 0) {
            if (map[y - 1][x] < map[y][x]) path += pathFind(map, y - 1, x);
        }
        if (x != 0) {
            if (map[y][x - 1] < map[y][x]) path += pathFind(map, y, x - 1);
        }
        if (y + 1 != map.length) {
            if (map[y + 1][x] < map[y][x]) path += pathFind(map, y + 1, x);
        }
        if (x + 1 != map[0].length) {
            if (map[y][x + 1] < map[y][x]) path += pathFind(map, y, x + 1);
        }

        dp[y][x] = path;
        return dp[y][x];
    }

}