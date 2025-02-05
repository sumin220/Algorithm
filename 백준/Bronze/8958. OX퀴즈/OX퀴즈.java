import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int score = 0;
            int consecutive = 0;

            for (char c : input.toCharArray()) {
                if (c == 'O') {
                    consecutive++;
                    score += consecutive;
                } else {
                    consecutive = 0;
                }
            }

            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }
}