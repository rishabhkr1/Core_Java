public class throwskeyword {
    public void divide(int N,int D) throws ClassNotFoundException {
        int res=0;
        if(D==0){
            System.out.println("Raising checked exception...");
            throw new ClassNotFoundException("D should be non-zero..");
        }else{
            res=N/D;
        }
        System.out.println("result of division : "+res);
    }

    public static void main(String[] args) {
        throwskeyword ts1=new throwskeyword();
        try{
            ts1.divide(12,0);
        }catch (ClassNotFoundException e){
            System.out.println("Cannot divide by zero..");
        }
    }
}