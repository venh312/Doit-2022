package prgm.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_01 {

    static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i=score.length; i>=m; i-=m) {
            answer += m * score[i - m];
        }
        return answer;
    }

    public static void main(String[] args) {
//        int k = 3;
//        int m = 4;
//        int[] score = {1,2,3,1,2,3,1};
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.print("==> result: " + solution(k, m, score));
    }
}
