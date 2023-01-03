package scratch_pad;

public class DfsFloodFill {

    static boolean[][] visited = new boolean[5][5];
    static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};

    static void dfs(int r, int c, int n) {
        visited[r][c] = true;
        adj[r][c] = 7;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                int nr = r + D[j][0], nc = c + D[j][1];
                if (nr < 0 || nr > n-1 || nc < 0 || nc > n-1) continue;
                if (visited[nr][nc]) continue;
                if (adj[nr][nc] == 1) continue;
                visited[nr][nc] = true;
                dfs(nr, c, n);
                dfs(r, nc, n);
            }
        }
    }

    static int[][] adj = new int[5][5];
    public static void main(String[] args) {
        adj[1][3] = 1;
        adj[1][4] = 1;
        adj[2][3] = 1;
        adj[3][0] = 1;
        adj[3][1] = 1;
        adj[3][2] = 1;
        adj[3][3] = 1;

        dfs(1,1, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
