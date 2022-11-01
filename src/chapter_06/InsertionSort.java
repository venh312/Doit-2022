package chapter_06;

/**
 * 단순 삽입 정렬 (straight insertion sort) O(n²)
 * 선택한 요소를 그 보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하는 알고리즘
 */
public class InsertionSort {
    static void InsertionSort(int[] a, int n) {
        for (int i=1; i<n; i++) {
            int j;
            int tmp = a[i];
            for (j=i; j>0 && a[j-1] > tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 3;
        a[1] = 6;
        a[2] = 1;
        a[3] = 8;
        a[4] = 2;
        a[5] = 4;

        InsertionSort(a, a.length);

        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}
