package collection;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq =new ArrayDeque<>();
        adq.offer(12);
        adq.addFirst(23);
        adq.offer(65);
        adq.offerLast(3);
        adq.offer(20);
        System.out.println(adq);
    }
}
