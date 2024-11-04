package collection;

import java.util.HashMap;
import java.util.Map;

public class learnMap {
    public static void main(String[] args) {
        Map<String,Integer> num=new HashMap<>();
        num.put("Aman",011);
        num.put("Ram",33);
        num.put("Tom",35);
        num.put("Sonu",35);
        System.out.println(num.get("Ram"));
        System.out.println(num);
        System.out.println(num.containsValue(35));

    }
}
