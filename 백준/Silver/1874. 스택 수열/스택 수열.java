import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int current = 1;  
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int num = sequence[i];

            while (current <= num) {
                stack.push(current);
                result.append("+\n");
                current++;
            }

            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
    }
}