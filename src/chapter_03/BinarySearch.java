package chapter_03;

public class BinarySearch {

    static int binarySearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n -1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,11,22,33,44,55};
        System.out.println("Key의 인덱스는 : " + binarySearch(a, a.length,44));
    }
}
