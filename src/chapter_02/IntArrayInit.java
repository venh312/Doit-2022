package chapter_02;

public class IntArrayInit {
    public static void main(String[] arg) {
        int[] arr = {1,2,3,4,5};

        int index = 0;
        for (int a: arr) {
            System.out.println("a["+index+"] = " + a);
            index++;
        }
    }
}
