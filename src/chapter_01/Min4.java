package chapter_01;

import java.util.Scanner;

public class Min4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a 값을 입력하세요.");
        int a = scanner.nextInt();
        System.out.print("b 값을 입력하세요.");
        int b = scanner.nextInt();
        System.out.print("c 값을 입력하세요.");
        int c = scanner.nextInt();
        System.out.print("d 값을 입력하세요.");
        int d = scanner.nextInt();

        System.out.println("최소 값 : " + min4(a,b,c,d));
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        return min;
    }
}
