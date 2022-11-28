package prgm.lv1;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기
 */
public class Practice_23 {

    static String solution(int[] numbers, String hand) {
        StringBuilder sBuilder = new StringBuilder();
        int[][] keypad = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};
        int[] leftHand = {3,0};
        int[] rightHand = {3,2};

        for (int i=0; i< numbers.length; i++) {
            int number = numbers[i];
            if (number == 1 || number == 4 || number == 7) { // 왼손
                sBuilder.append("L");
                leftHand = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) { // 오른손
                sBuilder.append("R");
                rightHand = keypad[number];
            } else {
                int[] target = keypad[number];
                int fromLeft = Math.abs(leftHand[0]-target[0]) + Math.abs(leftHand[1]-target[1]);
                int fromRight = Math.abs(rightHand[0]-target[0]) + Math.abs(rightHand[1]-target[1]);
                if (fromLeft < fromRight) { // 왼손
                    leftHand = target;
                    sBuilder.append("L");
                } else if (fromLeft > fromRight) { // 오른손
                    rightHand = target;
                    sBuilder.append("R");
                } else { // 같을 때
                    if (hand.equals("left")) {
                        leftHand = target;
                        sBuilder.append("L");
                    } else {
                        rightHand = target;
                        sBuilder.append("R");
                    }
                }
            }
        }

        return sBuilder.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("==> result: " + solution(numbers, "right"));
    }
}
