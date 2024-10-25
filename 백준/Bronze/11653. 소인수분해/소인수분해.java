import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int i =2;

        while (true) {
            if (N % i == 0) {
                list.add(i);
                N = N / i;
            } else if (N == 1) {
                break;
            }else {
                i++;
            }
        }
        list.sort(Integer::compareTo);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}