package prgm.lv1;

import java.util.*;

/**
 * 해시
 * 완주하지 못한 선수
 */
public class Practice_29 {

    static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String p : participant)
            hashMap.put(p, hashMap.getOrDefault(p, 0)+1);

        for (String c : completion)
            hashMap.put(c, hashMap.get(c)-1);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 0)
                return entry.getKey();
        }

        return "";
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        long start = System.currentTimeMillis();

        System.out.println("==> result: " + solution(participant, completion));

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
