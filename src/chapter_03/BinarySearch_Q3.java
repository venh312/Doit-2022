package chapter_03;

/**
 * 이진탐색
 */
public class BinarySearch_Q3 {

    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;			// 검색 범위 맨앞의 인덱스
        int pr = n - 1;		// 　 〃    　맨끝의 인덱스
        do {
            int   pc = (pl + pr) / 2;	// 중앙요소의 인덱스
            if (a[pc] == key) {
                for ( ; pc > pl; pc--)	{
                    // key와 같은 맨앞의 요소를 검색합니다
                    if (a[pc - 1] < key)
                        break;
                }
                return pc;							// 검색 성공
            } else if (a[pc] < key)
                pl = pc + 1;						// 검색 범위를 앞쪽 절반으로 좁힘
            else
                pr = pc - 1;						// 검색 범위를 뒤쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1;									// 검색 실패
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,5,5,5,6,8,7,7,9};
        System.out.println("Key Index " + binSearchX(a, a.length, 5));
    }
}
