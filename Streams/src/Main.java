import java.util.Arrays;
import java.util.function.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List <String> names= Arrays.asList("Aman","Amit","Blake","Danish");

//        Predicate<String> startWithB=name->name.startsWith("B");
//        names.stream()
//                .filter(startWithB)
//                .forEach(System.out::println);
//
//        Predicate<String> start = name -> name.startsWith("A");
//        names.stream()
//                .filter(start)
//                .forEach(System.out::println);

//        Predicate<Integer> lessthan=i -> (i<18);
//        System.out.println(lessthan.test(20));
//
//       Consumer<String> printName=name-> System.out.println(name);
//       names.forEach(printName);
//
//       Function<String,Integer> stringLen=i->i.length();
//       names.stream().map(stringLen).forEach(System.out::println);


        List <String> names= Arrays.asList("Aman","Amit","Blake","Danish");
       List<String> ans = names.stream().map(String::toLowerCase).collect(Collectors.toList());


        System.out.println(names);
        names.forEach(n-> System.out.println(n));

    }
}