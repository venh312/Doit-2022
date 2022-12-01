package prgm.lv1;

import java.util.*;

/**
 * 완전탐색
 * 모의고사
 */
public class Practice_27 {

    static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i=1; i<=3; i++)
            h.put(i, 0);

        for (int i=0; i<answers.length; i++) {
            int a = answers[i];
            if (a == first[i % first.length]) h.put(1, h.get(1)+1);
            if (a == second[i % second.length]) h.put(2, h.get(2)+1);
            if (a == three[i % three.length]) h.put(3, h.get(3)+1);
        }

        int max = Math.max(Math.max(h.get(1), h.get(2)), h.get(3));

        List<Integer> list = new ArrayList<>();
        for (Integer i : h.keySet())
            if (h.get(i) == max) list.add(i);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;

        //위처럼 배열에 직접 넣을 경우 시간이 0~1ms까지 줄일 수 있다.
        //return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};
        int[] answers3 = {5, 5, 4, 2, 3};
        int[] answers4 = {3, 3, 2, 1, 5};

        long start = System.currentTimeMillis();

        for (int i : solution(answers4)) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
