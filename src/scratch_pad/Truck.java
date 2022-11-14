package scratch_pad;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i=0; i<bridge_length; i++) {
            q.offer(0);
        }

        int currentWeight = 0;

        while (!q.isEmpty()) {
            currentWeight -= q.poll();

            for (int truckWeight : truck_weights) {
                if ((truckWeight + currentWeight) <= weight) {
                    q.offer(truckWeight);
                }
            }

            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] trucks = {7,4,5,6};
        System.out.println(solution(2, 10, trucks));
    }
}
