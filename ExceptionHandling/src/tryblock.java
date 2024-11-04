public class tryblock {
    public static void main(String[] args) {
        System.out.println("Main Method");
        try{
            System.out.println("Try Block");
            System.out.println(100/0);
            System.out.println("Try");// never execute
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program Terminates");
    }
}
