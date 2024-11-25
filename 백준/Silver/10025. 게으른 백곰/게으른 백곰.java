import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int maxPosition = 1000000;
        int[] ice = new int[maxPosition + 1];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            ice[x] += g;
        }
        
        int windowSize = 2 * K + 1;
        long currentSum = 0;
        long maxSum = 0;
        
        for (int i = 0; i <= maxPosition; i++) {
            if (i < windowSize) {
                currentSum += ice[i];
            } else {
                currentSum += ice[i];
                currentSum -= ice[i - windowSize];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        
        System.out.println(maxSum);
    }
}