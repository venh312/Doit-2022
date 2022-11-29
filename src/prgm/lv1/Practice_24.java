package prgm.lv1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

/**
 * 2019 카카오 개발자 겨울 인턴십
 * 크레인 인형뽑기 게임
 */
public class Practice_24 {

    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Stack<Integer>> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<board.length; i++)
            list.add(new Stack<Integer>());

        for (int j=0; j<board.length; j++) {
            for (int k=board.length-1; k>=0; k--) {
                if (board[k][j] == 0) continue;
                list.get(j).add(board[k][j]);
            }
        }

        for (int m : moves) {
            Stack<Integer> element = list.get(m-1);
            if (!element.isEmpty()) {
                int data = element.pop();
                if (!stack.isEmpty() && Objects.equals(stack.peek(), data)) {
                    answer += 2;
                    stack.pop();
                } else {
                    stack.add(data);
                }
            }
        }

        return answer;
    }

    public int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println("==> result: " + solution(board, moves));
    }
}
