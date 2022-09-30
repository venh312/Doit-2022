package chapter_01_1;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a 값을 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("b 값을 입력하세요 : ");
        int b = scanner.nextInt();
        System.out.print("c 값을 입력하세요 : ");
        int c = scanner.nextInt();

        System.out.println("중앙 값 : " + median(a,b,c));
    }

    static int median(int a, int b, int c) {
        // 3, 1, 2
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

}
