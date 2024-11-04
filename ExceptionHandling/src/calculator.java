public class calculator {
    public  void divide(int numerator, int denominator){
        int res=0;
        try{
            res=numerator/denominator;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0 ");
        }
        System.out.println("res of division is : "+res);
    }

    public static void main(String[] args) {
        calculator c1=new calculator();
        c1.divide(12,0);
    }
}

