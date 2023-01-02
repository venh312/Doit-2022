package prgm.lv2;

import java.util.ArrayList;
import java.util.List;

/*
* 완전탐색
* 모음사전
*/
public class Practice_13 {
    static List<String> dictionary;
    static String[] alphabetArr = {"A", "E", "I", "O", "U"};
    static void dfs(String str) {
        dictionary.add(str);

        if (str.length() >= alphabetArr.length) return;

        for (String alphabet : alphabetArr) {
            System.out.print(alphabet);
            dfs(str + alphabet);
        }
    }
    static int solution(String word) {
        int answer;
        dictionary = new ArrayList<>();

        dfs("");

        answer = dictionary.indexOf(word);
        return answer;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("==> result : " + solution("AAAAE"));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
