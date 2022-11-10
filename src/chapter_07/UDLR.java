package chapter_07;

import java.util.Scanner;

/**
 * 1. 첫 입력은 공간의 크기
 * 2. 이동 계획 내용
 *
 * out. 도착 지점 좌표
 */
public class UDLR {
    public static void main(String[] args) {
        // 5
        // R R R U D D
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        String[] directionArr = scanner.nextLine().split(" ");

        int x = 1;
        int y = 1;

        // R U L D
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        for (String direction : directionArr) {
            int nx = 0;
            int ny = 0;

            if ("R".equals(direction)) {
                nx = x + dx[0];
                ny = y + dy[0];
            } else if ("U".equals(direction)) {
                nx = x + dx[1];
                ny = y + dy[1];
            } else if ("L".equals(direction)) {
                nx = x + dx[2];
                ny = y + dy[2];
            } else if ("D".equals(direction)) {
                nx = x + dx[3];
                ny = y + dy[3];
            }

            if ((nx >= 1 && nx <= n) && (ny >= 1 && ny <= n)) {
                x = nx;
                y = ny;
            }
        }

        System.out.println("x : " + x + " | y : " + y);
    }
}
