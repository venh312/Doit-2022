package chapter_01;

import java.util.Scanner;

public class Multi99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력 할 구구단을 입력하세요 : ");
        multiTable(scanner.nextInt());
        System.out.print("출력 할 덧셈을 입력하세요 : ");
        plusTable(scanner.nextInt());
    }

    static void multiTable(int a) {
        System.out.print("  |");
        for (int i=1; i <= a; i++) {
            System.out.print("  "+i);
        }
        System.out.println("\n---+---------------------------");
        for (int i=1; i <= a; i++) {
            System.out.print(i);
            System.out.print(" | ");
            for (int y=1; y <= a; y++) {
                System.out.print(" "+i*y+" ");
            }
            System.out.println();
        }
    }

    static void plusTable(int a) {
        System.out.print("  |");
        for (int i=1; i <= a; i++) {
            System.out.print("  "+i);
        }
        System.out.println("\n---+---------------------------");
        for (int i=1; i <= a; i++) {
            System.out.print(i);
            System.out.print(" | ");
            for (int y=1; y <= a; y++) {
                System.out.print(" "+(i+y)+" ");
            }
            System.out.println();
        }
    }
}
