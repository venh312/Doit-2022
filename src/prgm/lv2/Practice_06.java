package prgm.lv2;

/**
 * 2022 KAKAO BLIND RECRUITMENT
 * k진수에서 소수 개수 구하기
 */
public class Practice_06 {

    static boolean primeNumber(Long num) {
        for (long i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    static int solution(int n, int k) {
        int answer = 0;

        String[] arr = Integer.toString(n, k).split("0");

        for (String a : arr)
            if (!a.isEmpty() && !a.equals("1"))
                if (primeNumber(Long.parseLong(a))) answer++;

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
