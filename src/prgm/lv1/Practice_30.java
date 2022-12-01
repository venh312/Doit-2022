package prgm.lv1;

/**
 * 명예의 전당 (1)
 */
public class Practice_30 {

    static int[] solution(int k, int[] score) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        long start = System.currentTimeMillis();

        solution(3, score);

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
