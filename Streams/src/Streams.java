import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Amit","Abhishek","Sumit","Rohan","Mohan","Aman","Zyan");
        List<Integer> num=Arrays.asList(1,8,7,4,6,8,9,3,5,7);
        //Stream<String> data=name.stream();
//        long size=data.count();
//        System.out.println(size);
        //data.forEach(n-> System.out.println(n));

//        name.stream()
//                .sorted()
//                .map(n->n.toUpperCase())
//                .filter(n->n.startsWith("A"))
//                .forEach(n-> System.out.println(n));


//        num.stream()
//                .filter(n->n%2==0)
//                .sorted()
//                .distinct()
//                .map(n->n+1)
//                .forEach(n-> System.out.println(n));



//       int sum= num.stream().reduce(0,(a,b)->a+b);
//        System.out.println(sum);


//       Integer min= num.stream().min((a,b)->a.compareTo(b)).get();
//        System.out.println(min);
//
//        Integer max=num.stream().max((x,y)->x.compareTo(y)).get();
//        System.out.println(max);





    }
}
