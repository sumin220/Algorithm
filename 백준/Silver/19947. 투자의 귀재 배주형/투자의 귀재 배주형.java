import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken()); 
        int Y = Integer.parseInt(st.nextToken()); 

        int[] dp = new int[Y + 1];
        dp[0] = H; 

        for (int y = 1; y <= Y; y++) {
            dp[y] = (int) Math.floor(dp[y - 1] * 1.05);

            if (y >= 3) {
                dp[y] = Math.max(dp[y], (int) Math.floor(dp[y - 3] * 1.20));
            }

            if (y >= 5) {
                dp[y] = Math.max(dp[y], (int) Math.floor(dp[y - 5] * 1.35));
            }
        }

        System.out.println(dp[Y]);
    }
}