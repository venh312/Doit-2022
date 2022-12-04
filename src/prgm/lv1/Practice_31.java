package prgm.lv1;

import java.util.HashSet;

/**
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 다트 게임
 */
public class Practice_31 {
    static int solution(String dartResult) {
        int index = 0;
        int sIndex = 0;
        String[] dartArr = dartResult.split("");
        String[] stages = new String[3];

        HashSet<String> hashSet = new HashSet<>();

        for (int i=0; i<=10; i++) hashSet.add(String.valueOf(i));
        for (int i=0; i<dartArr.length; i++) {
            if (sIndex == 2) {
                stages[sIndex] = dartResult.substring(index, dartArr.length);
            } else if (i > 0 && hashSet.contains(dartArr[i])) {
                if ((dartArr[i-1] + dartArr[i]).equals("10")) continue;
                stages[sIndex] = dartResult.substring(index, i);
                index = i;
                sIndex++;
            }
        }

        int[] result = stageReplace(stages);

        return result[0] + result[1] + result[2];
    }

    static int[] stageReplace(String[] stages) {
        int[] result = new int[3];

        for (int i=0; i<stages.length; i++) {
            int numberIndex = 0, sqrt = 0;

            if (stages[i].contains("S")) {
                numberIndex = stages[i].indexOf("S");
                sqrt = 1;
            } else if (stages[i].contains("D")) {
                numberIndex = stages[i].indexOf("D");
                sqrt = 2;
            } else {
                numberIndex = stages[i].indexOf("T");
                sqrt = 3;
            }

            int number = Integer.parseInt(stages[i].substring(0, numberIndex));
            int sum = (int) Math.pow(number, sqrt);

            if (stages[i].contains("*")) {
                sum = sum * 2;
                if (i > 0) result[i-1] = result[i-1] * 2;
            } else if (stages[i].contains("#")) {
                sum = sum * (-1);
            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solution("10S10D*3T");
        //solution("1D2S#10S");
        //solution("1D2S0T");
        //solution("1S*2T*3S");
        //solution("1D#2S*3S");
        //solution("1T2D3D#");
        //solution("1D2S3T*");
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
