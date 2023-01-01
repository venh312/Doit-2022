package scratch_pad;

public class Subset {
    static int[] arr = {1,2,3,4,5,6};
    public static void main(String[] args) {
        int cnt = 0;
        // 두 수의 합이 7인 경우
        for (int i = 0 ; i < (1 << arr.length); i ++) {
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                if (Integer.bitCount(i) == 2) {
                    if ((i & (1<<j)) != 0) {
                        sum += arr[j];
                    }
                }
            }
            if (sum == 7) cnt++;
        }

        System.out.print("==> result : " + cnt);
    }
}
