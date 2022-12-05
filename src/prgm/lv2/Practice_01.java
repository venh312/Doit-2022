package prgm.lv2;

import java.util.*;

/**
 * 연습문제
 * 귤 고르기
 */
public class Practice_01 {

    static int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : tangerine) hashMap.put(i, hashMap.getOrDefault(i,0) + 1);

        ArrayList<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, (o1, o2) -> Integer.compare(hashMap.get(o2), hashMap.get(o1)));

        int total = 0;
        for (int h : list) {
            total += hashMap.get(h);
            answer++;
            if (total >= k) return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3}; // k=6, 3
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3}; // k=4, 2
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3}; // k=2, 1
        System.out.print("==> result: " + solution(6, tangerine));
//        System.out.print("==> result: " + solution(4, tangerine2));
//        System.out.print("==> result: " + solution(2, tangerine3));
    }
}
