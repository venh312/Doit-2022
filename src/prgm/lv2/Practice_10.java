package prgm.lv2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2021 카카오 채용연계형 인턴십
 * 거리두기 확인하기
 */
public class Practice_10 {

    static class Info {
        int row, col, dist;
        public Info(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    static int[][] D = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    static boolean bfs(String[] place, int row, int col) {
        boolean[][] visit = new boolean[5][5];
        visit[row][col] = true;

        Queue<Info> q = new LinkedList<>();
        q.offer(new Info(row, col, 0));

        while (!q.isEmpty()) {
            Info info = q.poll();
            if (info.dist > 2) continue;
            if (info.dist != 0 && place[info.row].charAt(info.col) == 'P') return false;
            for (int i = 0; i < 4; i++) {
                int nr = info.row + D[i][0], nc = info.col + D[i][1];
                if (nr < 0 || nr > 4 || nc < 0 || nc > 4) continue;
                if (visit[nr][nc]) continue;
                if (place[nr].charAt(nc) == 'X') continue;
                visit[nr][nc] = true;
                q.offer(new Info(nr, nc,info.dist + 1));
            }
        }

        return true;
    }

    static boolean check(String[] place) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (place[i].charAt(j) == 'P')
                    if (!bfs(place, i, j)) return false;
            }
        }
        return true;
    }


    static public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0 ; i < 5; i++) {
            if (check(places[i]))
                answer[i] = 1;
            else
                answer[i] = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        for (int r : solution(places)) {
            System.out.print(r + " ");
        }

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
