import java.awt.image.SampleModel;

class sampleThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child thread");
        }
    }
}

public class runnableInterface {
    public static void main(String[] args) {
        sampleThread st =new sampleThread();
        Thread t=new Thread(st);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main method");
        }
    }
}
