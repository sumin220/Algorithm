import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = N-1;
        int minSum = Integer.MAX_VALUE;
        int leftValue = 0;
        int rightValue = 0;


        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                leftValue = arr[left];
                rightValue = arr[right];
            }
            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(leftValue + " " + rightValue);
    }
}