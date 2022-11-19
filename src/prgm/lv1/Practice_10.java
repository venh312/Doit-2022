package prgm.lv1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 신고 결과 받기
 */
public class Practice_10 {

    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashSet<String> reportSet = new HashSet<>();
        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        HashMap<String, Integer> reportedMap = new HashMap<>();

        for (String r : report) reportSet.add(r);
        for (String id : id_list) reporterMap.put(id, new HashSet<String>());

        for (String r : reportSet) {
            String[] list = r.split(" ");
            reporterMap.get(list[0]).add(list[1]);
            reportedMap.put(list[1], reportedMap.getOrDefault(list[1], 0) + 1);
        }

        for (String s : reportedMap.keySet()) {
            if (reportedMap.get(s) >= k) {
                for (int i=0; i<reporterMap.size(); i++) {
                    if (reporterMap.get(id_list[i]).contains(s)) answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        System.out.println("==> result: " + solution(id_list, report, 2));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        System.out.println("==> result: " + solution(id_list2, report2, 3));
    }
}
