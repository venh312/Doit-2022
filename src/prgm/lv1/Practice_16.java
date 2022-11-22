package prgm.lv1;


/**
 *  약수의 개수와 덧셈
 */
public class Practice_16 {
    static int solution(int left, int right) {
        int answer = 0;

        for (int i=left; i<=right; i++) {
            int cnt = 0;
            for (int j=1; j*j<=i; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (j * j < i) cnt++;
                }
            }
            if ((cnt % 2) == 0) answer += i;
            else answer -= i;
        }


        return answer;
    }

    static int solution2(int left, int right) {
        int answer = 0;

        for (int i=left; i<=right; i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("==> result: " + solution2(13,17));
    }
}
