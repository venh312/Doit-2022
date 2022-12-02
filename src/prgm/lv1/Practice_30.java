package prgm.lv1;

import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 명예의 전당 (1)
 */
public class Practice_30 {

    static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i=0; i<score.length; i++) {
            if (i < k) {
                treeMap.put(score[i], treeMap.getOrDefault(score[i],0)+1);
                answer[i] = treeMap.firstKey();
            } else {
                int f = treeMap.firstKey();
                if (score[i] > f) {
                    if (treeMap.get(f) > 1) treeMap.put(f, treeMap.get(f)-1);
                    else treeMap.remove(f);
                    treeMap.put(score[i], treeMap.getOrDefault(score[i],0)+1);
                    answer[i] = treeMap.firstKey();
                } else {
                    answer[i] = treeMap.firstKey();
                }
            }
        }

        return answer;
    }

    static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        long start = System.currentTimeMillis();

        solution2(3, score);

        long end = System.currentTimeMillis();
        System.out.println("시간: " + (end - start) + " ms");
    }
}
