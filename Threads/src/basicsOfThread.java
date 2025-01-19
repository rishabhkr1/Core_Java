class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
        System.out.println("Child Thread..");
    }
    }
    public void run(int a){
        System.out.println("int argument");
    }
}

public class basicsOfThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        //mt.start();
        mt.run();
        for(int i=0;i<10;i++){
            System.out.println("Main thread...");
        }
    }
}
