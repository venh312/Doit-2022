package prgm.lv1;

import java.util.Arrays;

/**
 * 정렬
 * K번째수
 */
public class Practice_28 {

    static int findK(int[] array, int i, int j, int k) {
        int[] arr = new int[j - (i-1)];
        int index = 0;

        for (int x=i-1; x<j; x++) {
            arr[index] = array[x];
            index++;
        }

        Arrays.sort(arr);

        return arr[k-1];
    }


    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++)
            answer[i] = findK(array, commands[i][0], commands[i][1], commands[i][2]);

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        long start = System.currentTimeMillis();

        for (int i : solution(array, commands)) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
