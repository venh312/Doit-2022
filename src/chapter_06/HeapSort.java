package chapter_06;

public class HeapSort {

    static void heapify(int[] arr, int n) {
        for (int i=1; i<n; i++) {
            int child = i;
            while (child != 0) {
                int parent = (child-1) / 2;
                if (arr[parent] < arr[child]) {
                    int tmp = arr[parent];
                    arr[parent] = arr[child];
                    arr[child] = tmp;
                }
                child = parent;
            }
        }
    }

    static void heapSort(int[] arr, int n) {
        heapify(arr, arr.length);
        for (int j=n-1; j>0; j--) {
            int tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            int root = 0;
            int c = 1;
            while (c < j) {
                c = 2*root + 1;
                if (c<j-1 && arr[c] < arr[c+1]) {
                    c++;
                }
                if (c<j && arr[root] < arr[c]) {
                    int tmp2 = arr[root];
                    arr[root] = arr[c];
                    arr[c] = tmp2;
                }

                root = c;
            }
        }
    }

    static void print(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
        heapSort(arr, arr.length);
        print(arr);
    }
}
