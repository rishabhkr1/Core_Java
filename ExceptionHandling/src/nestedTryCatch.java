public class nestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try{
            System.out.println("Try Block Started");

            try{
                System.out.println("Nested Try Block");
                System.out.println(100/0);
            }catch (ArithmeticException e){
                System.out.println("Nested Catch Block");
            }
            System.out.println(100/0);
            System.out.println("Try Block Ended");

        }catch (ArithmeticException e){
            System.out.println("Catch Block");
        }
    }
}
