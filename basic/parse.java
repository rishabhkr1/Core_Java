package basic;

public class parse {
    public static void main(String[] args) {
        String num="123654";
        String str="abc";
        try {
            int n=Integer.parseInt(str);
            System.out.println(n);
        }catch (NumberFormatException e){
            System.out.println("Error");
        }finally {
            System.out.println("try catch block");
        }
        int m=Integer.parseInt(num);
        System.out.println(m);
    }
}
