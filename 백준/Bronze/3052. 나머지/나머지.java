import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int cal = input % 42;
            num.add(cal);
        }
        System.out.println(num.size());
    }
}