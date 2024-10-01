import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;

        int a = arr[0] - Integer.parseInt(st.nextToken());
        int b = arr[1] - Integer.parseInt(st.nextToken());
        int c = arr[2] - Integer.parseInt(st.nextToken());
        int d = arr[3] - Integer.parseInt(st.nextToken());
        int e = arr[4] - Integer.parseInt(st.nextToken());
        int f = arr[5] - Integer.parseInt(st.nextToken());

        System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f);
    }
}