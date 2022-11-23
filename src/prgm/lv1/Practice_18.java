package prgm.lv1;

/**
 * 월간 코드 챌린지 시즌2
 * 음양 더하기
 */
public class Practice_18 {
    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i=0; i<absolutes.length; i++) {
            if (signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }

        return answer;
    }

    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        System.out.println("==> result: " + solution(absolutes, signs));
    }
}
