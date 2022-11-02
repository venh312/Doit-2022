package chapter_06;

public class ShellSort {
    static void shellSort(int[] a, int n) {
        for (int h=n/2; h>0; h/=2) {
            for (int i=h; i<n; i++) {
                int j;
                int tmp = a[i];
                for (j=i-h; j>=0 && a[j] > tmp; j-=h) {
                    a[j+h] = a[j];
                }
                a[j+h]=tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[7];
        a[0] = 6;
        a[1] = 4;
        a[2] = 3;
        a[3] = 7;
        a[4] = 1;
        a[5] = 9;
        a[6] = 8;

        shellSort(a, a.length);

        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}
