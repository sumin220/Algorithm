import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int value = N;
        int count = 0;

        while (!map.containsKey(value)) {
            map.put(value, count++);
            value = (value * N) % P;
        }
        
        System.out.println(count - map.get(value));
    }
}