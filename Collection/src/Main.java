import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Ravi");
        name.add("Ayush");
        name.add("Harshit");
        for(String a:name){
            System.out.println(a);
        }

        List<String> name2=new LinkedList<>();

        name2.add("Ravi");
        name2.add("Ayush");
        name2.add("Harshit");
        for(String a:name2){
            System.out.println(a);
        }
    }
}