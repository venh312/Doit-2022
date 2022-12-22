package prgm.lv2;

/**
 * 완전탐색
 * 전력망을 둘로 나누기
 */
public class Practice_08 {
    static void bfs(int n, int start) {
    }

    static int solution(int n, int[][] wires) {
        int answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("==> result: " + solution(80, new int[][] {{80,20}, {50,40}, {30,10}}));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
