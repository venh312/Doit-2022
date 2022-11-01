package chapter_05;

/**
 * 유클리드 호제법
 * 2개의 자연수 또는 정식(整式)의 최대공약수를 구하는 알고리즘
 */
public class EuclidGCD {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        System.out.println("gcd : " + gcd(22,8));
    }

}
