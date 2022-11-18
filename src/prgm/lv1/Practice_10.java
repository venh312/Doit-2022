package prgm.lv1;

import java.util.Hashtable;
import java.util.Map;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 신고 결과 받기
 */
public class Practice_10 {

    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Hashtable<String, String> h = new Hashtable<>();
        Hashtable<String, Integer> h2 = new Hashtable<>();

        for (String id : id_list) h.put(id, "");

        for (int i=0; i<report.length; i++) {
            String[] r = report[i].split(" ");
            if (!h.get(r[0]).contains(r[1])) h.put(r[0], r[1] + "," + h.get(r[0]));
        }

        for (Map.Entry<String, String> e : h.entrySet()) {
            System.out.println("key: " + e.getKey() + " | value: " + e.getValue());
        }

        String[] a = h.get("apeach").split(",");

        for (String x : a) {
            System.out.println(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println("==> result: " + solution(id_list, report, 2));

//        String[] id_list2 = {"con", "ryan"};
//        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        System.out.println("==> result: " + solution(id_list2, report2, 3));
    }
}
