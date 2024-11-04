package collection;

import java.util.Stack;

public class learnstack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("cat");
        System.out.println(animals.peek());

        System.out.println(animals.pop());
    }
}
