package prgm.lv1;

import java.util.Arrays;

/**
 *  로또의 최고 순위와 최저 순위
 *  2021 Dev-Matching: 웹 백엔드 개발
 */
public class Practice_17 {

    static boolean binarySearch(int[] arr, int n, int key) {
        int pl = 0;
        int pr = n-1;

        while (pl <= pr) {
            int pc = (pl + pr) / 2;
            if (arr[pc] == key)
                return true;
            else if (arr[pc] > key)
                pr = pc - 1;
            else if (arr[pc] < key)
                pl = pc + 1;
        }

        return false;
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6,6,5,4,3,2,1};
        int win_count = 0;
        int lose_count = 0;

        Arrays.sort(win_nums);

        for (int i=0; i<lottos.length; i++) {
            int l = lottos[i];
            if (l == 0) win_count++;
            else if (binarySearch(win_nums, win_nums.length, l)) {
                win_count++;
                lose_count++;
            }
        }

        answer[0] = rank[win_count];
        answer[1] = rank[lose_count];

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println("==> result: " + solution(lottos,win_nums)[0]);
        System.out.println("==> result: " + solution(lottos,win_nums)[1]);
    }
}
