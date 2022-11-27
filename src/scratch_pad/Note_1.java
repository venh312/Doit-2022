package scratch_pad;

import java.util.*;

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

        Queue<Integer> q = new LinkedList<>();

        q.offer(3);
        q.offer(4);
        q.offer(2);
        q.offer(1);
        q.offer(5);
        q.offer(6);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println("===============================");
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                }

                return -1;
            }
        });

        pq.offer(3);
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(5);
        pq.offer(6);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


        //System.out.println(fivo(4));
    }
}
