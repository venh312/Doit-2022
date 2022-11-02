package chapter_06;

/**
 * 퀵 정렬 (quick sort) O(n log n)
 * 어떤 값을 기준으로 작은값 큰값을 반복하여 공간을 나누어 정렬하는 방법
 */
public class QuickSort {
    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int pc = a[(pl + pr) / 2];

        do {
            while (a[pl] < pc) pl++;
            while (a[pr] > pc) pr--;
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;
        a[1] = 8;
        a[2] = 7;
        a[3] = 4;
        a[4] = 5;
        a[5] = 2;
        a[6] = 6;
        a[7] = 3;
        a[8] = 9;

        quickSort(a, 0, a.length-1);

        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}
