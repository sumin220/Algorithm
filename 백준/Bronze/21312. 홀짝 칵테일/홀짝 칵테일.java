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

        int[] arr = {A, B, C, A * B, A * C, B * C, A * B * C};

        int odd = Integer.MIN_VALUE;
        int even = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i % 2 != 0) {
                odd = Math.max(i, odd);
            } else {
                even = Math.max(i, even);
            } 
        }

        if (odd != Integer.MIN_VALUE) {
            System.out.println(odd);
        } else {
            System.out.println(even);
        } 


    }
}