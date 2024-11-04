package collection;

import java.util.LinkedList;
import java.util.Queue;

public class learnqueue {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.offer(45);
        num.offer(75);
        num.offer(12);
        num.offer(31);
        System.out.println(num);
        System.out.println(num.peek());
        num.poll();
        System.out.println(num);

    }
}
