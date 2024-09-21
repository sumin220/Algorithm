import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //5
        int M = Integer.parseInt(st.nextToken()); //4

        int[] basket = new int[N];

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) -1; //1
            int j = Integer.parseInt(st.nextToken()) -1; //2
            int k = Integer.parseInt(st.nextToken()); //3
            for (int b = i; b <= j; b++) {
                basket[b] = k;
            }
        }
        for (int a = 0; a < N; a++) {
            System.out.print(basket[a] + " ");
        }
    }
}
