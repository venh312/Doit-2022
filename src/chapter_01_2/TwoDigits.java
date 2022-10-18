package chapter_01_2;

import java.util.Scanner;

public class TwoDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int no;

        System.out.println("2자리 양수를 입력하세요.");

        //드모르간 법칙
        /*
        각 조건을 부정하고 논리곱을 논리합으로 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다.
        */
        do {
            System.out.print("no 값 입력 : ");
            no = scanner.nextInt();
        } while (no < 10 || no > 99); // (!(no >= 10 && no <= 99)) 와 같다

        System.out.println("변수 no 값은" + no + "입니다.");
    }
}
