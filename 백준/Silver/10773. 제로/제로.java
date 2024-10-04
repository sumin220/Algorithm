import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
            if (stack.peek() == 0) {
                stack.pop();
                stack.pop();
            }
        }
        int total = 0;
        for (int i = 0; i < stack.size(); i++) {
            total += stack.get(i);
        }
        System.out.println(total);
    }
}