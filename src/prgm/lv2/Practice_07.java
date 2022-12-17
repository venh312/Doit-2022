package prgm.lv2;

/**
 * 완전탐색
 * 피로도
 */
public class Practice_07 {
    public static boolean check[];
    public static int answer = 0;

    static void dfs(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && dungeons[i][0] <= tired) {
                check[i] = true;
                System.out.println("tired: "+ tired);
                System.out.println("i: "+ i + ", d: "+dungeons[i][0]);
                dfs(tired-dungeons[i][1], dungeons, cnt+1);
                check[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }


    static int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("==> result: " + solution(80, new int[][] {{80,20}, {50,40}, {30,10}}));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
