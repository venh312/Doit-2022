package prgm.lv2;

import java.util.Arrays;

/*
마법의 엘리베이터 */
public class Practice_17 {
    static int solution(int storey) {
        int answer = 0;

        // 95, 154, 555
        while (storey != 0) {
            int n = storey % 10;
            if (n > 5) {
                storey += 10 - n;
                answer += 10 - n;
            } else if (n == 5 && (storey / 10) % 10 >= 5) {
                storey += 10 - n;
                answer += 10 - n;
            } else {
                storey = storey - n;
                answer += n;
            }
            storey = storey / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("==> result: " + solution(5)); // 5
        System.out.println("==> result: " + solution(555)); // 14
        System.out.println("==> result: " + solution(155)); // 11
        System.out.println("==> result: " + solution(154)); // 10
        System.out.println("==> result: " + solution(95)); // 6
        //System.out.println("==> result: " + solution(16)); // 6
        //System.out.println("==> result: " + solution(2554)); // 16
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
