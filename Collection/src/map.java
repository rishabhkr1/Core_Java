import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> data=new HashMap<>();
        data.put(1,"Raj");
        data.put(2,"Ravi");
        data.put(3,"Amit");
        System.out.println(data);
        for(Map.Entry<Integer,String> All:data.entrySet()){
//            System.out.print(All.getKey()+":");
//            System.out.println(All.getValue());
            System.out.println(All.getKey()+All.getValue());
        }
    }
}
