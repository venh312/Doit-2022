package prgm.lv2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2022 KAKAO TECH INTERNSHIP
 * 두 큐 합 같게 만들기
 */
public class Practice_03 {

    static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sumQ1 = 0;
        long sumQ2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int q : queue1) {
            sumQ1 += q;
            q1.offer(q);
        }
        for (int q : queue2) {
            sumQ2 += q;
            q2.offer(q);
        }

        long half = (sumQ1 + sumQ2) / 2;

        for (int i=0; i<queue1.length*3; i++) {
            if (sumQ1 > half) {
                int fValue = q1.poll();
                sumQ1 -= fValue;
                q2.offer(fValue);
                sumQ2 += fValue;
                answer++;
            } else if (sumQ2 > half) {
                int sValue = q2.poll();
                sumQ2 -= sValue;
                q1.offer(sValue);
                sumQ1 += sValue;
                answer++;
            }
        }

        if (sumQ1 != sumQ2) return -1;

        return answer;
    }

    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2}; // 2
        int[] queue2 = {4, 6, 5, 1};
        int[] queue3 = {1, 2, 1, 2}; // 7
        int[] queue4 = {1, 10, 1, 2};
        int[] queue5 = {1, 1}; // -1
        int[] queue6 = {1, 5};
        int[] queue7 = {1, 4};
        int[] queue8 = {3, 4};
        // 2, 29번의 경우는 각 큐의 합이 같은것을 판단하는 시점과 카운트를 올리는 시점

        System.out.print("==> result: " + solution(queue1, queue2));
    }
}
