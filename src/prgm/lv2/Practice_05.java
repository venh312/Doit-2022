package prgm.lv2;

import java.util.HashMap;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 주차 요금 계산
 */
public class Practice_05 {

    static int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        HashMap<String, int[]> hashMap = new HashMap<>();
        HashMap<String, Integer> cars = new HashMap<>();

        for (String r : records) {
            String[] record = r.split(" ");
            int time = (int) Math.ceil(Integer.parseInt(record[0].replace(":","")));
            System.out.println(time);
            if (record[2].equals("IN")) {
                hashMap.put(record[1], new int[] {time, 1});
            } else {
                int[] arr = hashMap.get(record[1]);
                int sum = Math.abs(time - arr[0]);
                if (sum > 60)
                    sum = Math.abs((sum * 6) / 10);
                hashMap.put(record[1], new int[] {0, 0});
                cars.put(record[1], cars.getOrDefault(record[1], 0 ) + sum);
            }
        }


        for (String s : cars.keySet()) {
            System.out.println("car: " + s + " val: " + cars.get(s));
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        solution(fees, records);
    }
}
