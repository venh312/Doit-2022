package prgm.lv2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 완전탐색
 * 전력망을 둘로 나누기
 */
public class Practice_test {

    static int[][] adj;
    static boolean[] visit;

    static int bfs(int n, int k) {
        int cnt = 1;
        visit = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);

        while (!q.isEmpty()) {
            int x = q.poll();
            visit[x] = true;
            for (int i = 1; i <= n; i++) {
                if (visit[i]) continue;
                if (adj[x][i] == 1) {
                    q.offer(i);
                    cnt++;
                }
            }
        }

        return Math.abs(cnt - (n - cnt));
    }


    static int solution(int n, int[][] wires) {
        int answer = n;
        adj = new int[n+1][n+1];

        // 무방향 인접행렬로 만든다.
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            adj[a][b] = 0;
            adj[b][a] = 0;

            answer = Math.min(answer, bfs(n, a));

            adj[a][b] = 1;
            adj[b][a] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("==> result: " + solution(9, new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}}));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
