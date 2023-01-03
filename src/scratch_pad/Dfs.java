package scratch_pad;

public class Dfs {

    static int[][] adj = new int[5][5];
    static boolean[] visited = new boolean[5];

    static void dfs(int start) {
        visited[start] = true;
        System.out.println(start);

        for (int i = 0; i < 5; i++) {
            if (!visited[i] && adj[start][i] == 1) {
                dfs(i);
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

        dfs(0);
    }

}
