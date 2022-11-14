package etc;

import java.util.Scanner;

/**
 * 개미전사
 * 4
 * 1 3 1 5
 */
public class DPP_01 {
    static int[] dp = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        // 2,2,4,5,1
        String[] box = scanner.nextLine().split(" ");

        dp[0] = Integer.parseInt(box[0]);
        dp[1] = Integer.parseInt(box[1]);

        for (int i=2; i<n; i++) {
            int next = Integer.parseInt(box[i]);
            dp[i] = Math.max(dp[i-1], dp[i-2] + next);
        }

        System.out.println(dp[n-1]);
    }
}
