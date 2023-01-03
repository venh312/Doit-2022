package prgm.lv2;

/*
* 2020 KAKAO BLIND RECRUITMENT
* 괄호 변환
*/
public class Practice_14 {

    static boolean passBracket(String u) {
        for (int i = 0; i < u.length(); i++) {
            if (!u.isEmpty())
                u = u.replace("()", "");
        }
        return u.isEmpty();
    }

    static String[] separation(String w) {
        String[] result = new String[2];
        StringBuilder u = new StringBuilder(), v = new StringBuilder();
        int left = 0;
        int right = 0;
        for (int i = 0 ; i < w.length(); i++) {
            char c = w.charAt(i);
            int index = i + 1;

            if (c == '(')
                left++;
            else if (c == ')')
                right++;

            if ((left > 0 && right > 0) && left == right && index % 2 == 0) {
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

        if (passBracket(p)) return p;

        String[] separation = separation(p);

        StringBuilder u = new StringBuilder(separation[0]);
        StringBuilder v = new StringBuilder(separation[1]);

        boolean flag = passBracket(u.toString());

        System.out.println("u가 올바른 문자열 인가요? : " + flag);

        while (flag) {
            String[] sp2 = separation(v.toString());
            if (!passBracket(sp2[0])) {
                String tmp = "(" + sp2[1] + ")";

                sp2[0] = sp2[0].substring(1, sp2[0].length());
                sp2[0] = sp2[0].substring(0, sp2[0].length()-1);
                sp2[0] = sp2[0].replace(")", "-");
                sp2[0] = sp2[0].replace("(", ")");
                sp2[0] = sp2[0].replace("-", "(");

                return answer = u.toString() + tmp + sp2[0];
            }
        }

        if (!flag) {
            String tmp = "(" + v.toString()+ ")";
            String uStr = u.toString();
            uStr = uStr.substring(1, uStr.length());
            uStr = uStr.substring(0, uStr.length()-1);
            uStr = uStr.replace(")", "-");
            uStr = uStr.replace("(", ")");
            uStr = uStr.replace("-", "(");

            return answer = uStr + tmp;
        }

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //System.out.println("==> result: " + solution(")(")); // ()
        //System.out.println("==> result: " + solution("(()())()")); // ()(())()
        //System.out.println("==> result: " + solution("))))((((")); // ()(())()
        System.out.println("==> result: " + solution(")()(()")); // ((()))
        //System.out.println("==> result: " + solution("()))((()")); // ()(())()
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
