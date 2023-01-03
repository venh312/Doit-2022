package prgm.lv2;

import java.util.*;

/*
2021 KAKAO BLIND RECRUITMENT
메뉴 리뉴얼
 */
public class Practice_12 {
    static List<Map<String,Integer>> list = new ArrayList<>();
    static int[] maxLen = new int[11];
    static void comb(char[] c, int pos, StringBuilder sb) {
        if (pos >= c.length) {
            int len = sb.length();
            if (len >= 2) {
                int cnt = list.get(len).getOrDefault(sb.toString(),0) + 1;
                list.get(len).put(sb.toString(), cnt);
                maxLen[len] = Math.max(maxLen[len], cnt);
            }
            return;
        }

        comb(c, pos + 1, sb.append(c[pos]));
        sb.setLength(sb.length()-1);
        comb(c, pos + 1, sb);
    }


    static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for (int i = 0; i < 11; i++)
            list.add(new HashMap<String,Integer>());

        for (String order : orders) {
            char[] c = order.toCharArray();
            Arrays.sort(c);
            comb(c, 0, new StringBuilder());
        }

        List<String> sList = new ArrayList<>();
        for (int len : course) {
            for (Map.Entry<String,Integer> e : list.get(len).entrySet()) {
                if (e.getValue() >= 2 && e.getValue() == maxLen[len]) {
                    sList.add(e.getKey());
                }
            }
        }

        Collections.sort(sList);

        return sList.toArray(new String[sList.size()]);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        System.out.println("==> result : " + solution(orders, course));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
