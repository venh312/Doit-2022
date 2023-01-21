package prgm.lv2;

public class Practice_11 {

    static int[][] matrix;
    static int rotate(int[] query) {
        int r1 = query[0]-1;
        int c1 = query[1]-1;
        int r2 = query[2]-1;
        int c2 = query[3]-1;

        int temp = matrix[r1][c1];
        int min = temp;
        for (int i = r1; i < r2; i++) {
            int val = matrix[i][c1] = matrix[i+1][c1];
            if (min > val) min = val;
        }

        for (int i = c1; i < c2; i++) {
            int val = matrix[r2][i] = matrix[r2][i+1];
            if (min > val) min = val;
        }

        for (int i = r2; i > r1; i--) {
            int val = matrix[i][c2] = matrix[i-1][c2];
            if (min > val) min = val;
        }

        for (int i = c2; i > c1; i--) {
            int val = matrix[r1][i] = matrix[r1][i-1];
            if (min > val) min = val;
        }

        matrix[r1][c1+1] = temp;

        return min;
    }


    static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        matrix = new int[rows][columns];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < columns; j++)
                matrix[i][j] = i*columns + j + 1;
        }

        // 회전하고 최솟값 answer에 저장
        for (int i = 0; i < queries.length; i++)
            answer[i] = rotate(queries[i]);

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int[][] queries = {{2,2,5,4},{3,3,6,6}, {5,1,6,3}};

        for (int r : solution(6, 6, queries)) {
            System.out.print(r + " ");
        }

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
