import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (prevPermutation(arr)) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
        } else {
            bw.write("-1\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    private static boolean prevPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the largest i such that arr[i] > arr[i+1]
        int i = n - 2;
        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

        int j = n - 1;
        while (arr[i] <= arr[j]) {
            j--;
        }

        swap(arr, i, j);

        reverse(arr, i + 1, n - 1);

        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}