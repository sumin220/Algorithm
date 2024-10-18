import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                return;
            }

            boolean isTrue= true;

            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}