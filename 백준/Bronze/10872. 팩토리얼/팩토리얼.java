import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = reculsive(n);
        System.out.println(result);
    }

    static int reculsive(int n) {
        if (n <= 1) {
            return 1;
        }
        return  n * reculsive(n - 1);
    }
}