import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] serials = new String[N];

        for (int i = 0; i < N; i++) {
            serials[i] = br.readLine();
        }

        Arrays.sort(serials, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }

            int sumA = sumOfDigits(a);
            int sumB = sumOfDigits(b);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return a.compareTo(b);
        });

        for (String serial : serials) {
            System.out.println(serial);
        }
    }

    private static int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}