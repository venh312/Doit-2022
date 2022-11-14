package prgm.lv1;

/**
 * 2 ≤ food의 길이 ≤ 9
 * 1 ≤ food의 각 원소 ≤ 1,000
 * food에는 칼로리가 적은 순서대로 음식의 양이 담겨 있습니다.
 * food[i]는 i번 음식의 수입니다.
 * food[0]은 수웅이가 준비한 물의 양이며, 항상 1입니다.
 * 정답의 길이가 3 이상인 경우만 입력으로 주어집니다.
 *
 * 입출력 예
 * food	result
 * [1, 3, 4, 6]	"1223330333221"
 * [1, 7, 1, 2]	"111303111"
 */
public class Practice_02 {

    static String solution(int[] food) {
        String answer = "";

        for (int i=1; i<food.length; i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] food1 = {1, 3, 4, 6};
        int[] food2 = {1, 7, 1, 2};
        System.out.println("==> result: " + solution(food1));
    }
}
