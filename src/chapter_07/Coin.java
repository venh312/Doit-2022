package chapter_07;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * O(coinTypes)
 */
public class Coin {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>(); // Hashtable 선언

        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            System.out.println("cnt: " + cnt);
            n %= coin;
            System.out.println("n: " + n);
        }

        System.out.println(cnt);
    }

}
