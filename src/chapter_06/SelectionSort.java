package chapter_06;

/**
 * 단순 선택 정렬 (straight selection sort) O(n²)
 * 가장 작은 요소를 맨 앞으로 이동하고 두 번쨰 작은 요소는 맨 앞에서ㅏ 두번째 ...작업을 반복하는 알고리즘
 */
public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n) {
        for (int i=0; i<n-1; i++) {
            int min = i;
            for (int j=i+1; j<n; j++) {
                if (a[j]  < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
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

        selectionSort(a, a.length);

        for (int data : a) {
            System.out.print(data + " ");
        }
    }
}
