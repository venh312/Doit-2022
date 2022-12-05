package prgm.lv2;

import java.util.Arrays;

/**
 * 연습문제
 * 숫자 카드 나누기
 */
public class Practice_02 {

    static int getMax(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        while (min > 1) {
            boolean flag = true;
            for (int a : arr) {
                if (a % min != 0) {
                    min--;
                    flag = false;
                    break;
                }
            }
            if (flag) break;
        }
        return min;
    }

    static boolean isExist(int k, int[] arr) {
        for (int a : arr)
            if (a % k == 0)
                return true;
        return false;
    }

    static int solution(int[] arrayA, int[] arrayB) {
        int a = getMax(arrayA);
        int b = getMax(arrayB);

        if (a > 1)
            if(!isExist(a, arrayB))
                return Math.max(a, b);
        if (b > 1)
            if(!isExist(b, arrayA))
                return Math.max(a, b);

        return 0;
    }

    public static void main(String[] args) {
        int[] arrayA = {10, 17};
        int[] arrayB = {5, 20};
        int[] arrayA2 = {10, 20};
        int[] arrayB2 = {5, 17};
        int[] arrayA3 = {14, 35, 119};
        int[] arrayB3 = {18, 30, 102};
        int[] arrayA4 = {20, 40, 10};
        int[] arrayB4 = {5, 17};
        System.out.println("==> result: " + solution(arrayA, arrayB)); // 0
        System.out.println("==> result: " + solution(arrayA2, arrayB2)); // 10
        System.out.println("==> result: " + solution(arrayA3, arrayB3)); // 7
        System.out.println("==> result: " + solution(arrayA4, arrayB4)); // 10
    }
}
