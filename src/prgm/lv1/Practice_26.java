package prgm.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 탐욕법(Greedy)
 * 체육복
 */
public class Practice_26 {

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        answer -= lost.length;

        for (int l : lost) {
            for (int j=0; j<reserve.length; j++) {
                if (l == 1 && reserve[j] == 1 || reserve[j] == 2) {
                    reserve[j] = 0;
                    answer++;
                    break;
                } else {
                    if ((l-1) == reserve[j] || l == reserve[j] || (l+1) == reserve[j]) {
                        reserve[j] = 0;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        int[] lost3 = {1,3};
        int[] reserve3 = {1};
        System.out.println("==> result: " + solution(5, lost, reserve));
        System.out.println("==> result: " + solution(5, lost2, reserve2));
        System.out.println("==> result: " + solution(3, lost3, reserve3));
    }
}
