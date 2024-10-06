import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine(); 

        int[] count = new int[10]; 

        for (int i = 0; i < roomNumber.length(); i++) {
            int num = roomNumber.charAt(i) - '0'; 
            count[num]++;
        }

        int sixNineCount = count[6] + count[9];
        count[6] = count[9] = (sixNineCount + 1) / 2; 

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = Math.max(result, count[i]);
        }

        System.out.println(result);
    }
}