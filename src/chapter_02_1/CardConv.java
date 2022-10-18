package chapter_02_1;

public class CardConv {

    public static void main(String[] args) {
        char[] cno = new char[32];

        int dno = CardConv(59, 10, cno);

        for (int i=0; i<dno; i++) {
            System.out.print(cno[i]);
        }
    }

    static String test(String b) {
        return b + "b";
    }


    /**
     * 진수 변환
     *
     * @param x 대상 값
     * @param r 변환 할 진수 값 (2 ~ 32)
     * @param d char 배열
     * @return
     */
    static int CardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ";

        while (x != 0) {
            char c = dchar.charAt(x % r);
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }

        for (int i=0; i<digits/2; i++) {
            char t = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = t;
        }
        System.out.println("digits : " + digits);
        return digits;
    }

}
