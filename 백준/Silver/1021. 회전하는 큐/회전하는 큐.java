import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }
        
        st = new StringTokenizer(br.readLine());
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        for (int target : targets) {
            int index = deque.indexOf(target);
            int left = index;
            int right = deque.size() - index;
            
            if (left <= right) {
                for (int i = 0; i < left; i++) {
                    deque.addLast(deque.removeFirst());
                    count++;
                }
            } else {
                for (int i = 0; i < right; i++) {
                    deque.addFirst(deque.removeLast());
                    count++;
                }
            }
            deque.removeFirst();
        }
        
        System.out.println(count);
    }
}