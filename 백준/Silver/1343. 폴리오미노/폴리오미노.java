import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        StringBuilder result = new StringBuilder();

        int count = 0;

        for (int i = 0; i < board.length(); i++) {
            char ch = board.charAt(i);

            if (ch == 'X') {
                count++;
            } else {
                if (count > 0) {
                    if (count % 2 != 0) {
                        System.out.println("-1");
                        return;
                    }
                    result.append("AAAA".repeat(count / 4));
                    result.append("BB".repeat((count % 4) / 2));
                    count = 0;
                }
                result.append('.');
            }
        }

        if (count > 0) {
            if (count % 2 != 0) {
                System.out.println("-1");
                return;
            }
            result.append("AAAA".repeat(count / 4));
            result.append("BB".repeat((count % 4) / 2));
        }

        System.out.println(result);
    }
}