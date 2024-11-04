package collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(45);
        set.add(32);
        set.add(68);
        set.add(65);
        System.out.println(set);
        System.out.println(set.contains(65));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
