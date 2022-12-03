package prgm.lv1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 2018 KAKAO BLIND RECRUITMENT
 * [1차] 다트 게임
 */
public class Practice_31 {



    /*
    1	1S2D*3T 	37	11 * 2 + 22 * 2 + 33
    2	1D2S#10S	9	12 + 21 * (-1) + 101
    3	1D2S0T	    3	12 + 21 + 03
    4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
    5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
    6	1T2D3D#	    -4	13 + 22 + 32 * (-1)
    7	1D2S3T*	    59	12 + 21 * 2 + 33 * 2
     */
    static int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int stageIndex = 0;
        String[] dartArr = dartResult.split("");
        String[] stages = new String[3];
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<=10; i++) hashSet.add(String.valueOf(i));

        // 1S2D*3T
        for (int i=0; i<dartArr.length; i++) {
            if (stageIndex == 2) {
                stages[stageIndex] = dartResult.substring(index, dartArr.length);
            } else if (i > 0 && hashSet.contains(dartArr[i])) {
                stages[stageIndex] = dartResult.substring(index, i);
                index = i;
                stageIndex++;
            }
//            else if (i+1 == dartArr.length) { // last
//                System.out.println(stages[0]);
//                System.out.println(stages[2]);
//                System.out.println(stages[1]);
//                stages[stageIndex] = dartResult.substring(index, dartArr.length);
//            }
        }

        System.out.println(stages[0]);
        System.out.println(stages[1]);
        System.out.println(stages[2]);
        System.out.println("==========================");
        int[] result = stageReplace(stages);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        return result[0] + result[1] + result[2];
    }

    static int[] stageReplace(String[] stages) {
        int[] result = new int[3];

        for (int i=0; i<stages.length; i++) {

            int sdt =0, sqrt = 0;

            if (stages[i].contains("S")) {
                sdt = stages[i].indexOf("S");
                sqrt = 1;
            } else if (stages[i].contains("D")) {
                sdt = stages[i].indexOf("D");
                sqrt = 2;
            } else {
                sdt = stages[i].indexOf("T");
                sqrt = 3;
            }

            int number = Integer.parseInt(stages[i].substring(0, sdt));

            String[] stage = stages[i].split("");
            int sum = (int) Math.pow(number, sqrt);

            if (stages[i].contains("*")) {
                sum = sum * 2;

                if (i > 0) {
                    result[i-1] = result[i-1] * 2;
                }

            } else if (stages[i].contains("#")) {
                sum = sum * (-1);
            }

            result[i] = sum;
        }
        return result;
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // 37
        solution("1S2D*3T");
        //solution("1D2S#10S");
        //solution("1D2S0T");
        //solution("1S*2T*3S");
        //solution("1D#2S*3S");
//        solution("1T2D3D#");
        //solution("1D2S3T*");

        //System.out.println("===> result: " + solution("1S2D*3T"));
        // 9
        //System.out.println("===> result: " + solution("1D2S#10S"));
        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
