package prgm.lv1;


/**
 * 숫자 문자열과 영단어
 * 2021 카카오 채용연계형 인턴십
 */
public class Practice_15 {
    static int solution(String s) {
        int answer = 0;

        String[] sArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i=0; i<sArr.length; i++) {
            s = s.replace(sArr[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("==> result: " + solution("one4seveneight"));
        System.out.println("==> result: " + solution("23four5six7"));
        System.out.println("==> result: " + solution("2three45sixseven"));
        System.out.println("==> result: " + solution("zero123"));
        System.out.println("==> result: " + solution("1zerotwozero3"));
    }
}
