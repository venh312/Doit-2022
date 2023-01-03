package prgm.lv2;

/*
2019 KAKAO BLIND RECRUITMENT
후보키
*/
public class Practice_15 {
    static int solution(String[][] relation) {
        int answer = 0;



        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        System.out.println("==> result: " + solution(relation)); // 2
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
