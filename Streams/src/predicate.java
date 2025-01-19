import java.util.function.*;
public class predicate {
    public static void main(String[] args) {
////
//        Predicate<Integer> p = i-> i%2==0;
//        System.out.println(p.test(10));
//
//        Function<Integer,Integer> mul=i->i*i;
//        System.out.println(mul.apply(4));
//
//        Function<String,Integer> length=i->i.length();
//        System.out.println(length.apply("Rishabh"));
//
//        Function<String,String> con=i->i.toUpperCase();
//        System.out.println(con.apply("my name is rishabh"));

        Consumer<String> name=s-> System.out.print(s);
        name.accept("Rishabh ");
        name.accept("Kumar");
    }
}
