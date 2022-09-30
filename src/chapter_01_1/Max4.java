package chapter_01_1;

import java.util.Scanner;

public class Max4 {
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

        System.out.println("최대 값 : " + max4(a,b,c,d));
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }
}
