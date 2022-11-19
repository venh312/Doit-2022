package prgm.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 없는 숫자 더하기
 * 문제 설명
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Practice_13 {
    static int solution(int[] numbers) {
        int answer = 0;
        int[] checkArr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> intList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        for (int data : checkArr) {
            if (!intList.contains(data)) answer+=data;
        }

        return answer;
    }

    public int solution2(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] size = {1,2,3,4,6,7,8,0};
        int[] size2 = {5,8,4,0,6,7,9};
        System.out.println("==> result : " + solution(size));
        //System.out.println("==> result : " + solution(size2));
    }
}
