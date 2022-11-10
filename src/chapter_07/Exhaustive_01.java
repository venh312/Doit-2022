package chapter_07;

public class Exhaustive_01 {

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 0;
        int cnt = 0;

        for (int i=0; i<=n; i++) {
            for (int j=0; j<60; j++) {
                for (int k=0; k<60; k++) {
                    if (check(i,j,k)) cnt++;
                }
            }
        }

        System.out.println("Find Key 3: " + cnt);
    }
}
