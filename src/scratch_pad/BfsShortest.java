package scratch_pad;

import java.util.LinkedList;
import java.util.Queue;

public class BfsShortest {

    static class Point {
        int r, c, dist;

        public Point(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    static int[][] table = new int[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};

    static void bfs(int sr, int sc, int er, int ec, int n) {
        Queue<Point> q = new LinkedList<>();
        visited[sr][sc] = true;
        q.add(new Point(sr, sc, 0));

        while (!q.isEmpty()) {
            Point point = q.remove();

            for (int i = 0; i < 4; i++) {
                int nr = point.r + D[i][0], nc = point.c + D[i][1];
                if (nr < 0 || nr > n - 1 || nc < 0 || nc > n - 1) continue;
                if (visited[nr][nc]) continue;
                if (table[nr][nc] == 1) continue;
                visited[nr][nc] = true;
                q.add(new Point(nr, nc, point.dist + 1));
            }

            if (point.r == er && point.c == ec)
                System.out.print(point.dist);
        }
    }

    public static void main(String[] args) {
        table[0][1] = 7;
        table[1][1] = 1;
        table[1][2] = 1;
        table[1][3] = 1;
        table[1][4] = 1;
        table[3][0] = 1;
        table[3][1] = 1;
        table[3][2] = 1;
        table[3][3] = 1;
        table[4][2] = 7;

        bfs(0,1,4,2, table.length);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
    }
}
