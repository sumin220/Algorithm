import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int input;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            input = Integer.parseInt(br.readLine());
            if (input < 40) {
                input = 40;
            }
            total += input;
        }
        System.out.println(total/5);
    }
}