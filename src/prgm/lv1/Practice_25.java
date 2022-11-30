package prgm.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 2019 KAKAO BLIND RECRUITMENT
 * 실패율
 */
public class Practice_25 {

    static int[] solution(int N, int[] stages) {
        int length = stages.length;
        int[] stay = new int[N+2];
        HashMap<Integer, Double> hashMap = new HashMap<>();

        for (int s : stages)
            stay[s]++;

        for (int i=1; i<stay.length-1; i++) {
            if (stay[i] == 0 && length == 0)
                hashMap.put(i, 0.0);
            else
                hashMap.put(i, (double) stay[i] / length);
            length -= stay[i];
        }

        List<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(hashMap.get(o2), hashMap.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages2 = {4, 4, 4, 4, 4};
        int[] stages3 = {3, 3, 3, 3};
        //solution(5, stages);
        //solution(4, stages2);
        for (int i : solution(5, stages))
            System.out.print(i + " ");
    }
}
