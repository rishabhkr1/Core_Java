import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CountOccur {
    public static void main(String[] args) {
        int a[]={2, 13, 4, 1, 41, 31, 31, 4, 13, 2};
        ArrayList<Integer> ab=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            ab.add(a[i]);
        }
        HashMap<Integer,Integer> ac=new HashMap<>();
        for(int i=0;i<ab.size();i++){
            ac.putIfAbsent(ab.get(i), Collections.frequency(ab,ab.get(i)));
           // System.out.println(ac);
        }
        System.out.println();
    }
}
