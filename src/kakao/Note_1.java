package kakao;

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

    public static void main(String[] args) {

        for (int i=0; i<visited.length; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(4);
        graph.get(1).add(7);
        graph.get(4).add(5);
        graph.get(4).add(6);
        graph.get(6).add(3);
        graph.get(3).add(2);

        //dfs(1);
        bfs(1);
    }
}
