import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            int M = Integer.parseInt(firstLine[1]);

            String[] secondLine = br.readLine().split(" ");
            Queue<Document> queue = new LinkedList<>();
            int[] priorities = new int[10]; 

            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(secondLine[i]);
                queue.offer(new Document(i, priority));
                priorities[priority]++;
            }

            int printed = 0;

            while (!queue.isEmpty()) {
                Document current = queue.poll();

                boolean hasHigherPriority = false;
                for (int i = current.priority + 1; i <= 9; i++) {
                    if (priorities[i] > 0) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.offer(current);
                } else {
                    printed++;
                    priorities[current.priority]--;
                    if (current.index == M) {
                        sb.append(printed).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.print(sb);
    }

    static class Document {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}