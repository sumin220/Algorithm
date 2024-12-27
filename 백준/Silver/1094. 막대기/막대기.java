import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int stick = 64;
        int count = 0;

        while (N > 0) {
            if (N >= stick) {
                N -= stick;
                count++;
            } else {
                stick /= 2;
            }
        }
        System.out.println(count);
    }
}