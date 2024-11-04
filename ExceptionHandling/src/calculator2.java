public class calculator2 {
    public void divide(int n,int d){
        int res=0;
        res=n/d;
        System.out.println("result is : "+res);
    }

    public static void main(String[] args) {
        calculator2 c2=new calculator2();
        try{
            c2.divide(12,0);
            System.out.println("Divide Successful....");
        }catch (ArithmeticException ex){
            System.out.println("back to main method..");
            System.out.println("Cannot divide by zero..");
        }
    }
}
