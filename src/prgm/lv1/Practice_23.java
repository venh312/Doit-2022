package prgm.lv1;

import java.util.TreeSet;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기
 */
public class Practice_23 {

    static String solution(int[] numbers, String hand) {
        String answer = "";
        int[] direction = {-1, 1, -1, 1};
        int[] keypad = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int leftHand = 1;
        int rightHand = 1;

        for (int i=1; i<=12; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0)
                System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("==> result: " + solution(numbers, "right"));
    }
}
