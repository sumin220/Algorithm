import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] grid, blindGrid;
    static boolean[][] visited, blindVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        blindGrid = new char[N][N];
        visited = new boolean[N][N];
        blindVisited = new boolean[N][N];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char c = line.charAt(j);
                grid[i][j] = c;
                blindGrid[i][j] = (c == 'G') ? 'R' : c;
            }
        }
        
        int normalCount = countRegions(grid, visited);
        int blindCount = countRegions(blindGrid, blindVisited);
        
        System.out.println(normalCount + " " + blindCount);
    }
    
    static int countRegions(char[][] map, boolean[][] visited) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(map, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    static void bfs(char[][] map, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        char color = map[x][y];
        
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cx = pos[0], cy = pos[1];
            
            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];
                
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && map[nx][ny] == color) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}