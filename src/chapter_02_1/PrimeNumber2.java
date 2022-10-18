package chapter_02_1;

//1,000 이하의 소수를 나열
public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];
        prime[ptr++] = 2;

        for (int n=3; n<=1000; n+=2) {
            int i;
            for (i=1; i<ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {
                    break;
                }
            }
            if (ptr == i) prime[ptr++] = n;
        }

        for (int i=0; i<ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 수 : " + counter);
    }
}
