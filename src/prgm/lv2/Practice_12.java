package prgm.lv2;

public class Practice_12 {

    static int[] solution(String[] info, String[] query) {
        int[] answer = new int[info.length];

        int cnt = 0;
        for (String qy : query) {

        }

        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        for (int r : solution(info, query)) {
            System.out.print(r + " ");
        }

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
