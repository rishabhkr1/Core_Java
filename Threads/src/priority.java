class priorityEx extends Thread{
   public void run(){
       for(int i=0;i<5;i++) {
           System.out.println("Child class");
       }
    }
}
public class priority {
    public static void main(String[] args) {
        priorityEx th1=new priorityEx();
     //   priorityEx th2=new priorityEx();

        th1.setPriority(10);
        th1.start();
       // th2.start();
        for (int i=0;i<5;i++){
            System.out.println("Main class");
        }
    }
}
