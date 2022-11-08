package kakao;

public class Courses30_64062 {

    static int solution(int[] stones, int k) {
        int answer = 0;
        int min = 1;
        int max = 200000000;

        while (max > min) {
            int mid = (min + max) / 2;
            System.out.println("a : " +mid);

            if (check(stones, k, mid)) {
                System.out.println("b : " + mid);
                //min = mid + 1;
                //answer = mid;
                return answer;
            } else {
                System.out.println("c : " + mid);
                max = mid;
            }
        }

        return answer;
    }

    static boolean check(int[] stones, int k, int friends) {
        int cnt = 0;
        for (int stone : stones) {
            if ((stone - friends) < 0) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (cnt == k) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        int k = 3;
        System.out.println(solution(a, k));
    }
}
