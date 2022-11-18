package prgm.lv1;

import java.util.Hashtable;

/**
 * 2022 KAKAO TECH INTERNSHIP
 * 성격 유형 검사하기
 */
public class Practice_09 {

    static String solution(String[] survey, int[] choices) {
        Hashtable<String, Integer> h = new Hashtable<>();
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
        String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
        for (String t : types) h.put(t, 0);

        for (int i=0; i<survey.length; i++) {
            String[] s = survey[i].split("");
            if (choices[i] < 4)
                h.put(s[0], h.get(s[0]) + score[choices[i]]);
            else if (choices[i] > 4)
                h.put(s[1], h.get(s[1]) + score[choices[i]]);
        }

        StringBuilder stringBuilder = new StringBuilder("RCJA");
        if (h.get("T") > h.get("R")) stringBuilder.replace(0, 1, "T");
        if (h.get("F") > h.get("C")) stringBuilder.replace(1, 2, "F");
        if (h.get("M") > h.get("J")) stringBuilder.replace(2, 3, "M");
        if (h.get("N") > h.get("A")) stringBuilder.replace(3, 4, "N");

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println("==> result: " + solution(survey, choices));
        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 = {7, 1, 3};
        System.out.println("==> result: " + solution(survey2, choices2));
    }
}
