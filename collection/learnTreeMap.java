package collection;

import javax.jnlp.IntegrationService;
import java.util.Map;
import java.util.TreeMap;

public class learnTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> data=new TreeMap<>();
        data.put(1,"hello");
        data.put(4,"Bonjour");
        data.put(2,"Hola");
        data.put(3,"Namaste");
        System.out.println(data);
        data.remove(2);

        System.out.println(data );
    }
}
