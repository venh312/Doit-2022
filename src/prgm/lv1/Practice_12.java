package prgm.lv1;

/**
 * 최소직사각형
 * 문제 설명
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 *
 * 아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
 */
public class Practice_12 {
    static int solution(int[][] sizes) {
        int wMax = Math.max(sizes[0][0], sizes[0][1]);
        int hMax = Math.min(sizes[0][0], sizes[0][1]);

        for (int i=1; i<sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            if (wMax < w) wMax = w;
            if (hMax < h) hMax = h;
        }

        return wMax * hMax;
    }

    public static void main(String[] args) {
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println("==> result : " + solution(size));
    }
}
