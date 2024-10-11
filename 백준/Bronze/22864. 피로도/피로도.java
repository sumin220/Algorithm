import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int fati = 0;
        int work = 0;

        for (int i = 0; i < 24; i++) {
            if (fati + A <= M) {
                fati += A;
                work += B;
            } else {
                fati -= C;
                if (fati < 0) {
                    fati = 0;
                }
            }
        }
        System.out.println(work);
    }
}