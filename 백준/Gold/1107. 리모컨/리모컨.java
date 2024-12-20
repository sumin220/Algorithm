import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int brokenCount = Integer.parseInt(br.readLine());
        boolean[] broken = new boolean[10];

        if (brokenCount > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < brokenCount; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int minPress = Math.abs(target - 100);

        for (int i = 0; i <= 999_999; i++) {
            String channel = String.valueOf(i);
            boolean isValid = true;

            for (char c : channel.toCharArray()) {
                if (broken[c - '0']) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                int pressCount = channel.length() + Math.abs(target - i);
                minPress = Math.min(minPress, pressCount);
            }
        }

        System.out.println(minPress);
    }
}