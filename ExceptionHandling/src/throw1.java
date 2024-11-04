public class throw1 {
    public void divide(int N,int D){
        int res=0;
        if(D==0){
            try{
                throw new ClassNotFoundException("D should be non zero..");
            }catch (ClassNotFoundException e){
                System.out.println("Class not found exception... ");
            }
        }else{
            res=N/D;
        }
        System.out.println("Result is : "+res);
    }
    public static void main(String[] args) {
        throw1 th1 = new throw1();
        try{
            th1.divide(12,2);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero ..");
            //e.printStackTrace();
        }
    }

}
