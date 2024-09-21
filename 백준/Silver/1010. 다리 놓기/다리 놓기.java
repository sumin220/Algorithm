import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); 
            int M = Integer.parseInt(st.nextToken()); 

            sb.append(combination(M, N)).append("\n");
        }

        System.out.println(sb);
    }

    public static long combination(int n, int m) {
        long result = 1;
        for (int i = 0; i < m; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}