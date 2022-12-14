package prgm.lv2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 주차 요금 계산
 */
public class Practice_05 {

    static long getMinutes(String t1, String t2) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
        Date d1 = f.parse(t1);
        Date d2 = f.parse(t2);
        long diff = d2.getTime() - d1.getTime();
        return diff / (1000 * 60);
    }

    static int[] solution(int[] fees, String[] records) throws ParseException {
        HashMap<String, String[]> hashMap = new HashMap<>();
        HashMap<String, Long> cars = new HashMap<>();

        for (String r : records) {
            String[] record = r.split(" ");
            if (record[2].equals("IN")) {
                hashMap.put(record[1], new String[] {record[0], "IN"});
            } else {
                String time = hashMap.get(record[1])[0];
                hashMap.put(record[1], new String[] {"0", "OUT"});
                cars.put(record[1], cars.getOrDefault(record[1], 0L ) + getMinutes(time, record[0]));
            }
        }

        for (String s : hashMap.keySet())
            if ("IN".equals(hashMap.get(s)[1]))
                cars.put(s, cars.getOrDefault(s, 0L) + getMinutes(hashMap.get(s)[0], "23:59"));

        List<String> list = new ArrayList<>(cars.keySet());
        Collections.sort(list);

        int[] answer = new int[list.size()];
        int index = 0;
        for (String s : list) {
            int sum = fees[1];
            if (cars.get(s) > fees[0])
                sum = (int) (fees[1] + Math.ceil((double)(cars.get(s) - fees[0]) / fees[2]) * fees[3]);
            answer[index] = sum;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();
        int[] fees = {180, 5000, 10, 600};
        int[] fees2 = {180, 5000, 10, 600};
        int[] fees3 = {1, 461, 1, 10};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        String[] records2 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        String[] records3 = {"00:00 1234 IN"};
        solution(fees, records);
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
