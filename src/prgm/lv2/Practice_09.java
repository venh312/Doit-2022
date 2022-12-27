package prgm.lv2;

import java.util.ArrayList;
import java.util.List;

/**
 * 월간 코드 챌린지 시즌3
 * n^2 배열 자르기
 */
public class Practice_09 {

    static int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>();

//        2차원 배열에서 k번째 해당하는 좌표를 구하는 방법
//        X = k/n, Y = k%n
        for (long i = left; i < right+1; i++)
            list.add((int) (Math.max(i/n, i%n) + 1));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] result = solution(3, 2, 5);
        for (int i = 0; i < result.length; i ++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
