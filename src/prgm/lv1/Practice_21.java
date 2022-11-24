package prgm.lv1;

/**
 * 3진법 뒤집기
 */
public class Practice_21 {

    static int conv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ";

        while (x != 0) {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }

        return digits;
    }


    static int solution(int n) {
        StringBuilder s = new StringBuilder();

        while (n != 0) {
            s.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(s.toString(),3);
    }

    public static void main(String[] args) {
        System.out.println("==> result: " + solution(45));
        System.out.println("==> result: " + solution(125));
    }
}
