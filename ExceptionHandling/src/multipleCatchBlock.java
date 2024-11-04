public class multipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try{
            System.out.println("Try Block Started");
            int a[]={};

            System.out.println(100/0);
            System.out.println(a[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }

    }
}
