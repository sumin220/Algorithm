import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> fruits = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits.add(Integer.parseInt(st1.nextToken()));
        }
        fruits.sort(Integer::compareTo);
        for (int i = 0; i < N; i++) {
            if (fruits.get(i) <= m) {
                m++;
            }
        }
        System.out.println(m);
    }
}