package prgm.lv2;

/*
* 2020 KAKAO BLIND RECRUITMENT
* 괄호 변환
*/
public class Practice_14 {

    static boolean passBracket(String u) {
        return u.charAt(0) == '(' && u.charAt(1) == ')';
    }

    static String[] separation(String w) {
        String[] result = new String[2];
        StringBuilder u = new StringBuilder(), v = new StringBuilder();
        char[] cArr = new char[2];

        for (int i = 0 ; i < w.length(); i++) {
            char c = w.charAt(i);
            int index = i + 1;

            if (c == '(') {
                cArr[0] = c;
            } else if (c == ')') {
                cArr[1] = c;
            }

            if (cArr[0] != '\u0000' && cArr[1] != '\u0000' && index % 2 == 0) {
                u.append(w.substring(0, index));
                v.append(w.substring(index, w.length()));
                break;
            }
        }

        System.out.println("==> u : " + u.toString());
        System.out.println("==> v : " + v.toString());

        result[0] = u.toString();
        result[1] = v.toString();

        return result;
    }

    static String solution(String p) {
        String answer = "";

        String[] separation = separation(p);

        StringBuilder u = new StringBuilder(separation[0]);
        StringBuilder v = new StringBuilder(separation[1]);

        if (passBracket(u.toString())) {
            separation(v.toString());
        }

        return answer;
    }

    public static void main(String[] args) {
        /*
        "aabbaccc"	7
        "ababcdcdababcdcd"	9
        "abcabcdede"	8
        "abcabcabcabcdededededede"	14
        "xababcdcdababcdcd" 17
         */
        long start = System.currentTimeMillis();
        //System.out.println("==> result: " + solution(")(")); // ()
        System.out.println("==> result: " + solution("()))((()")); // ()(())()
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
