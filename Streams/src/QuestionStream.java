import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionStream {
    public static void main(String[] args) {

//                List<String> list = Arrays.asList("Mo hit", "Ra hul", "Am it", " A", "m", "a", "n");
//                List<String> answer =
//                        list.stream()
//                       // .map(String::toUpperCase)
//                              //  .sorted()
//                                .flatMap(listq->Arrays.stream(listq.split(" ")))// Split from " " to words
//                               // .peek(a-> System.out.print(" sorted : "+a))
//                               // .sorted(Comparator.reverseOrder()) // Sorted in reverse order
//                        .collect(Collectors.toList());
//                System.out.println(answer);




        List<String> name= Arrays.asList("Amit","Abhishek","Sumit","Rohan","Mohan","Aman","Zyan");
        List<Integer> num=Arrays.asList(1,8,7,4,6,8,9,3,5,7);


        // Question 1 Square all numbers
        //num.stream().map(n->n*n).forEach(a-> System.out.println(a));

        //Question 2 find the length of the longest name in the list
//        Integer maxna=name.stream().map(e->e.length()).max((x,y)->x.compare(x,y)).get();
//        System.out.println(maxna);

        // Question 3 count the total number of distinct words (case-insensitive) in all the sentences

        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences.");

//        int count= (int) sentences.stream()
//                .flatMap(a->Arrays.stream(a.split(" ")))
//                .distinct()
//                .count();
//        System.out.println(count);


//        Question 4 find the concatenation of the first two words that have even lengths.

//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
//        String conCat=words.stream()
//                .filter(e->e.length()%2==0)
//                .limit(2)
//                .collect(Collectors.joining());
//        System.out.println(conCat);


//        Question 5 Find the sum of the squares of even numbers in the list.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().forEach(Collectors.toSet());
//                         .mapToInt(value -> value*value)
//                                 .filter(e->e%2==0)
//                                         .sum();
        System.out.println(sum);

    }
}
