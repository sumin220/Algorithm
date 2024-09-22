import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        
        double[] scores = new double[N];
        double max = 0.0;
        
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += (scores[i] / max) * 100;
        }
        
        System.out.println(sum / N);
    }
}