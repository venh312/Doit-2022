package prgm.lv1;

import java.util.*;

/**
 * 탐욕법(Greedy)
 * 체육복
 */
public class Practice_26 {

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        HashSet<Integer> ko = new HashSet<Integer>();

        for (int k : reserve)
            ko.add(k);

        for (int i =0;i<lost.length;i++) {
            if (ko.contains(lost[i])) {
                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }

        for (int i =0;i<lost.length;i++) {
            if (ko.contains(lost[i]-1)) {
                answer++;
                ko.remove(lost[i]-1);
            } else if (ko.contains(lost[i]+1)) {
                answer++;
                ko.remove(lost[i]+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        int[] lost3 = {1,2};
        int[] reserve3 = {2,3};
        System.out.println("==> result: " + solution(5, lost, reserve));
        System.out.println("==> result: " + solution(5, lost2, reserve2));
        System.out.println("==> result: " + solution(3, lost3, reserve3));
    }
}
