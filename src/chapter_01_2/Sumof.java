package chapter_01_2;

import java.util.Scanner;

public class Sumof {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a 값을 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("b 값을 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("a ~ b 사이의 모든 값의 합은 : " + sumof(a, b));

        System.out.print("[가우스의 덧셈] n 값을 입력하세요 : ");
        int c = scanner.nextInt();
        System.out.println("1 ~ n 사이의 모든 값의 합은 : " + gauss(c));
    }

    public static int gauss(int a){
        return (1+a)*(a/2) + (a%2==0 ? 0 : (a+1)/2);
    }

    static int sumof(int a, int b) {
        int sum = 0;
        int min = 0;
        int max = 0;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        while (max >= min) {
            sum = sum + min;
            min++;
        }

        return sum;
    }

    static int factorial(int a) {
        if (a == 1) return 1;
        return a * factorial(a - 1);
    }
}
