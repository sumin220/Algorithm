import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push" :
                    int value = Integer.parseInt(command[1]);
                    queue.add(value);
                    last = value;
                    break;

                case "pop" :
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    }else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;

                case "size" :
                    bw.write(queue.size() + "\n");
                    break;

                case "empty" :
                    if (queue.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;

                case "front" :
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;

                case "back" :
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(last + "\n");
                    }
                    break;

            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}