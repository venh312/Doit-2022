package prgm.lv2;

import java.util.Arrays;

/*
테이블 해시 함수
*/
public class Practice_16 {
    static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        int column = col - 1;

        Arrays.sort(data, (o1, o2) -> {
            return o1[column] != o2[column] ? o1[column]-o2[column] : o2[0]-o1[0];
        });

        for (int i = row_begin - 1; i < row_end; i++) {
            int sum = 0;
            for (int j = 0; j < data[0].length; j++)
                sum += data[i][j] % (i+1);
            answer ^= sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[][] data = {{2,2,6}, {1,5,10}, {4,2,9}, {3,8,3}};
        System.out.println("==> result: " + solution(data, 2, 2, 3)); // 4
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
