import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();

        int zero = 0;
        int one = 0;
        if (line.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i-1) != line.charAt(i)) {
                if (line.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));




    }
}