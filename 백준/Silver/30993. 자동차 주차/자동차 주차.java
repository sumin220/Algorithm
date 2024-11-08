import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long[][][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        dp = new long[N + 1][A + 1][B + 1][C + 1];
        
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= A; j++) {
                for (int k = 0; k <= B; k++) {
                    for (int l = 0; l <= C; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
        
        System.out.println(parkCars(N, A, B, C));
    }

    static long parkCars(int N, int A, int B, int C) {
        if (N == 0) {
            return (A == 0 && B == 0 && C == 0) ? 1 : 0;
        }

        if (dp[N][A][B][C] != -1) {
            return dp[N][A][B][C];
        }

        long count = 0;

        if (A > 0) {
            count += parkCars(N - 1, A - 1, B, C);
        }

        if (B > 0) {
            count += parkCars(N - 1, A, B - 1, C);
        }

        if (C > 0) {
            count += parkCars(N - 1, A, B, C - 1);
        }

        dp[N][A][B][C] = count;
        return count;
    }
}