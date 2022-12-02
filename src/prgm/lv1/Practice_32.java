package prgm.lv1;

/**
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 비밀지도
 */
public class Practice_32 {

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        long start = System.currentTimeMillis();

        // ["#####","# # #", "### #", "# ##", "#####"]
        solution(5, arr1, arr2);

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
