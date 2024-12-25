import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder discarded = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            discarded.append(queue.poll()).append(" "); 
            queue.add(queue.poll()); 
        }

        discarded.append(queue.poll()); 
        
        System.out.println(discarded.toString());
    }
}