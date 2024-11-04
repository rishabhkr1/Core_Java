public class throwkeyword {
    public void divide(int n,int d){
        int res=0;
        if(d==0){
            throw new ArithmeticException("Denominator should not be zero..");
        }else {
            res=n/d;
        }
        System.out.println("result is : "+res);
    }

    public static void main(String[] args) {
        throwkeyword th = new throwkeyword();
        try{
        th.divide(12,0);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero ..");
        //    e.printStackTrace();
        }
    }
}
