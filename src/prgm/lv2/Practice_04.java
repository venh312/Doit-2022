package prgm.lv2;

import java.util.Arrays;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * 양궁대회
 */
public class Practice_04 {

    static int[] solution(int n, int[] info) {
        int[] answer = new int[info.length];
        int maxDiff = 0;
        for (int i = 1; i < (1 << 10); i++) {
            int[] tmp = new int[info.length];
            int apeach = 0, ryan = 0, cnt = 0;
            for (int j = 0; j < 10; j++) {
                if ((i & (1 << j)) != 0) {
                    tmp[j] = info[j] + 1;
                    cnt += tmp[j];
                    ryan += 10 - j;
                } else {
                    if (info[j] != 0)
                        apeach += 10 - j;
                }
            }

            if (cnt > n) continue;

            tmp[10] = n - cnt;
            int total = ryan - apeach;

            if (total == maxDiff) {
                for (int k = 9; k >= 0; k--) {
                    if (tmp[k] > answer[k]) {
                        maxDiff = total;
                        answer = Arrays.copyOf(tmp, tmp.length);
                        break;
                    }
                }
            } else if (total > maxDiff) {
                maxDiff = total;
                answer = Arrays.copyOf(tmp, tmp.length);
            }
        }

        if (maxDiff == 0)
            return new int[]{-1};

        return answer;
    }

    public static void main(String[] args) {
        int[] info = {2,1,1,1,0,0,0,0,0,0,0}; // 5, 0,2,2,0,1,0,0,0,0,0,0
        int[] info2 = {1,0,0,0,0,0,0,0,0,0,0}; // 1, -1
        int[] info3 = {0,0,1,2,0,1,1,1,1,1,1}; // 9, 1,1,2,0,1,2,2,0,0,0,0
        int[] info4 = {0,0,0,0,0,0,0,0,3,4,3}; // 10, 1,1,1,1,1,1,1,1,0,0,2

        //solution(5, info);
        for (int i : solution(5, info)) {
            System.out.println(i);
        }
        //for (int i : solution(10, info4)) {
            //System.out.println(i);
        //}
    }
}
