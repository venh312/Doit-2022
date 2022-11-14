package scratch_pad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Note_1 {

    static boolean[] visited = new boolean[8];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int i=0; i<graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        visited[start] = true;
        q.offer(start);
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i=0; i<graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    visited[y] = true;
                    q.offer(y);
                }
            }
        }
    }


    static int[] dp = new int[100];
    static int fivo(int x) {

        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<x; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[x-1];
    }

    public static void main(String[] args) {
        System.out.println(fivo(4));
    }
}
