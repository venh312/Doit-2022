package prgm.lv1;

import java.util.HashMap;

/**
 * 2019 KAKAO BLIND RECRUITMENT
 * 실패율
 */
public class Practice_25 {

    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int stage_length = stages.length;
        HashMap<Integer, Double> h = new HashMap<Integer, Double>();

        for (int i=1; i<=stage_length; i++) {
            h.put(i, (double) (i / stage_length));
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages2 = {4,4,4,4,4};

        for (int i : solution(5, stages))
            System.out.print(i + " ");
    }
}
