package prgm.lv1;

/**
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 비밀지도
 */
public class Practice_32 {

    static void cardConv(int[][] arr, int index, int n) {
        int i = 0;
        while (n != 0) {
            arr[index][i++] = n % 2;
            n = n / 2;
        }

        int len = arr.length;
        for (int y=0; y<len/2; y++) {
            int tmp = arr[index][y];
            arr[index][y] = arr[index][len-(y+1)];
            arr[index][len-(y+1)] = tmp;
        }
    }


    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for (int i=0; i<n; i++) cardConv(map1, i, arr1[i]);
        for (int j=0; j<n; j++) cardConv(map2, j, arr2[j]);

        for (int i=0; i<n; i++) {
            StringBuilder sBuilder = new StringBuilder();

            for (int j=0; j<n; j++)
                sBuilder.append(String.valueOf(map1[i][j] | map2[i][j]));

            answer[i] = sBuilder.toString();
        }

        for (int i=0; i<n; i++)
            answer[i] = answer[i].replace("1","#").replace("0", " ");

        return answer;
    }

    String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};

        // ["#####","# # #", "### #", "# ##", "#####"]
        //solution(5, arr1, arr2);
        solution(6, arr3, arr4);

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
