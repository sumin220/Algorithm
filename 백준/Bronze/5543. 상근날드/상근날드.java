import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int burger = Integer.parseInt(br.readLine());
        int input1;

        for (int i = 0; i < 2; i++) {
            input1 = Integer.parseInt(br.readLine());
            if (input1 < burger) {
                burger = input1;
            }
        }
        int beverge = Integer.parseInt(br.readLine());
        int input2;
        for (int i = 0; i < 1; i++) {
            input2 = Integer.parseInt(br.readLine());
            if (input2 < beverge) {
                beverge = input2;
            }
        }
        System.out.println(burger + beverge - 50);
    }
}