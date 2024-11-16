import java.io.*;
import java.util.*;

public class Main {
    // 방향 정의: 북, 동, 남, 서
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); 

        int[][] room = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cleanedCount = cleanRoom(room, N, M, r, c, d);

        System.out.println(cleanedCount);
    }

    static int cleanRoom(int[][] room, int N, int M, int r, int c, int d) {
        int count = 0;

        while (true) {
            if (room[r][c] == 0) {
                room[r][c] = 2; 
                count++;
            }

            boolean hasUncleaned = false;
            for (int i = 0; i < 4; i++) {
                int nd = (d + 3) % 4; 
                int nr = r + dr[nd];
                int nc = c + dc[nd];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && room[nr][nc] == 0) {
                    d = nd;
                    r = nr;
                    c = nc;
                    hasUncleaned = true;
                    break;
                } else {
                    d = nd; 
                }
            }

            if (!hasUncleaned) {
                int backDirection = (d + 2) % 4;
                int br = r + dr[backDirection];
                int bc = c + dc[backDirection];

                if (br >= 0 && br < N && bc >= 0 && bc < M && room[br][bc] != 1) {
                    r = br;
                    c = bc;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}