package prgm.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 월간 코드 챌린지 시즌1
 * 두 개 뽑아서 더하기
 */
public class Practice_22 {

    static int[] solution(int[] numbers) {
        TreeSet<Integer> h = new TreeSet<>();

        for (int i=0; i<numbers.length; i++) {
            for (int k=i+1; k<numbers.length; k++)
                h.add(numbers[i] + numbers[k]);
        }

        int[] answer = new int[h.size()];

        int i=0;
        for (int s : h) {
            answer[i] = s;
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] numbers2 = {5,0,2,7};
        int[] numbers3 = {1,99,999,9};
        System.out.println("==> result: " + solution(numbers3));
    }
}
