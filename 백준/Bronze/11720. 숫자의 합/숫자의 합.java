import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += Integer.parseInt(s.charAt(i) + "");
        }
        System.out.println(result);
    }
}