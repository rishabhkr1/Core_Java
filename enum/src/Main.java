//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // System.out.println(Day.Monday);
//        Day[] values= Day.values();
//        for(Day i:values){
//            System.out.println(i);
//            System.out.println();
//        }
//        Day monday= Day.Monday;
//        monday.Display();
//        System.out.println(monday.getHindi());

        Day day=Day.Wednesday;
        switch (day){
            case Monday -> System.out.println("In Monday");
            case Tuesday -> System.out.println("In Tuesday");
            default -> System.out.println("Weekends");
        }
    }
}