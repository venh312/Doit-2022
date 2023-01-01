package scratch_pad;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static int[][] adj = new int[5][5];
    static boolean[] visited = new boolean[5];

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x);
            for (int i = 0; i < 5; i++) {
                if (!visited[i] && adj[x][i] == 1) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        adj[0][1] = adj[1][0] = 1;
        adj[0][2] = adj[2][0] = 1;
        adj[1][3] = adj[3][1] = 1;
        adj[1][4] = adj[4][1] = 1;
        adj[2][4] = adj[4][2] = 1;
        adj[3][4] = adj[4][3] = 1;

        bfs(0);
    }
}
