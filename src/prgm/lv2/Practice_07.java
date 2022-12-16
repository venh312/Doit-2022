package prgm.lv2;

/**
 * 완전탐색
 * 피로도
 */
public class Practice_07 {

    static int solution(int k, int[][] dungeons) {
        int answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solution(80, new int[][] {{80,20}, {50,40}, {30,10}});
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
