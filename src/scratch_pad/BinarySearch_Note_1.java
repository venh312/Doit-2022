package scratch_pad;

import java.util.Scanner;

/**
 * ndb796
 * 떡볶이 떡 만들기
 * 4(n) 6(m)
 * 19 15 10 17 (length)
 * m만큼 가져가기 위해 높이의 최댓값은?
 */
public class BinarySearch_Note_1 {
    static int check(String[] arr, int key, int height) {
        int result = 0;

        for (String data : arr) {
            int parse_data = Integer.parseInt(data);
            if (parse_data > height) {
                result += (parse_data - height);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("떡의 개수는? ");
        int n = scanner.nextInt();
        System.out.print("원하는 떡의 개수는? ");
        int m = scanner.nextInt();
        scanner.nextLine();
        System.out.print("떡의 길이는? ");
        String[] arr = scanner.nextLine().split(" ");

        int answer = 0;
        int min = 0;
        int max = 1000000000;

        while (min <= max) {
            int mid = (min + max) / 2;
            int result = check(arr, m, mid);

            if (result < m) {
                max = mid-1;
            } else {
                answer = mid;
                min = mid+1;
            }
        }

        System.out.println("==> 높이의 최댓값은? : " + answer);
    }
}
