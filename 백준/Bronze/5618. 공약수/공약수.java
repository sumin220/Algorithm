import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

            
        if (N == 2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            calc1(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        if (N == 3) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            calc2(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

    }

    static void calc1(int a, int b) {
        HashSet<Integer> set = new HashSet<>();

        if (a == b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    set.add(i);
                }
            }
        }

        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if(a % i ==0 && b % i == 0) {
                set.add(i);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (int i = 0; i < set.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void calc2(int a, int b, int c) {
        HashSet<Integer> set = new HashSet<>();

        if (a == b && b == c) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    set.add(i);
                }
            }
        }

        int min = Math.min(a, b);
        if (min > c) {
            min = c;
        }

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                set.add(i);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i = 0; i < set.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}