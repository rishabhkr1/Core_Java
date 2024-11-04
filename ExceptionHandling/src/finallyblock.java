public class finallyblock {
    public static void main(String[] args) {
        try {
            int[] a={};
            System.out.println("Try Block");
            System.out.println(a[2]);
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block");

        }finally {
            System.out.println("Finally Block");

        }
    }
}
