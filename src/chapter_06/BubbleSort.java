package chapter_06;

/**
 * 버블정렬(bubble sort) O(n²)
 * 이웃한 두 요소의 관계를 비교하고 필요에 따라 교환을 반복하는 알고리즘
 */
public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int cnt = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=n-1; j>i; j--) {
                cnt++;
                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                }
            }
        }
        System.out.println("비교 : " + cnt);
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

        bubbleSort(a, a.length);

        System.out.println("오름차순");

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();
    }
}
