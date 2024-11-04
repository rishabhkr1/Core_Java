package collection;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<>();
        stud.add("Ram");
        stud.add("Shyam");
        System.out.println(stud);
        stud.add(1,"Mohan");
        System.out.println(stud);
        stud.set(0,"Tom");
        System.out.println(stud);


    }
}
