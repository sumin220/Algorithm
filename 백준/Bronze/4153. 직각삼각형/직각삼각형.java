import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] count = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            count[0] = Integer.parseInt(st.nextToken());
            count[1] = Integer.parseInt(st.nextToken());
            count[2] = Integer.parseInt(st.nextToken());

            if (count[0] == 0 && count[1] == 0 && count[2] == 0) {
                break;
            }

            Arrays.sort(count);

            if (count[0] * count[0] + count[1] * count[1] == count[2] * count[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }


        }

    }
}