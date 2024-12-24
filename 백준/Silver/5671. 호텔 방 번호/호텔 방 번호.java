import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] range = input.split(" ");
            int N = Integer.parseInt(range[0]);
            int M = Integer.parseInt(range[1]);
            System.out.println(countUniqueNumbers(N, M));
        }
    }

    private static int countUniqueNumbers(int N, int M) {
        int count = 0;
        for (int i = N; i <= M; i++) {
            if (hasUniqueDigits(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasUniqueDigits(int number) {
        boolean[] digitSeen = new boolean[10];
        while (number > 0) {
            int digit = number % 10;
            if (digitSeen[digit]) {
                return false;
            }
            digitSeen[digit] = true;
            number /= 10;
        }
        return true;
    }
}