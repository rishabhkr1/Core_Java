package collection;

import java.util.PriorityQueue;

public class learnpriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(12);
        pq.offer(6);
        pq.offer(11);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);


    }
}
