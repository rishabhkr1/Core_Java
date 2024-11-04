package collection;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts =new TreeSet<>();
        ts.add(12);
        ts.add(32);
        ts.add(2);
        ts.add(5);
        System.out.println(ts);
        ts.remove(2);
        System.out.println(ts);
    }
}
