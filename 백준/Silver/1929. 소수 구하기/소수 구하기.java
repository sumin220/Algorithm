import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1];

        // 0과 1은 소수가 아니다.
        arr[0] = true;
        arr[1] = true;

        // 에라토스테네스의 체: 소수의 배수를 제외하는 작업
        for (int i = 2; i * i <= N; i++) {
            if (!arr[i]) {
                // i의 배수 제거 (i*i 부터 시작)
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }

        // 결과를 출력하기 위해 BufferedWriter 사용
        for (int i = M; i <= N; i++) {
            if (!arr[i]) {
                bw.write(i + "\n");
            }
        }

        // 출력 flush
        bw.flush();
        bw.close();
    }
}