package prgm.lv1;

/**
 * 2021 KAKAO BLIND RECRUITMENT
 * 신규 아이디 추천
 */
public class Practice_19 {

    static String replaceDot(String s) {
        s = s.replaceAll("^[.]|[.]$", "");
        return s;
    }

    static String solution(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^a-z0-9._-]", "");;

        answer = answer.replaceAll("[.]{2,}", ".");

        answer = replaceDot(answer);

        if (answer.length() == 0) answer = "a";
        if (answer.length() > 15) answer = answer.substring(0, 15);

        answer = replaceDot(answer);

        while (answer.length() < 3) {
            StringBuilder sBuilder = new StringBuilder(answer);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            answer = sBuilder.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("==> result: " + solution("=.="));
        System.out.println("==> result: " + solution("...!@BaT#*..y.abcdefghijklm."));
        System.out.println("==> result: " + solution("z-+.^."));
        System.out.println("==> result: " + solution("123_.def"));
        System.out.println("==> result: " + solution("abcdefghijklmn.p"));
    }
}
