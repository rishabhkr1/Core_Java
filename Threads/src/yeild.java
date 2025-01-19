class javaYeild extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" in control 1");
        }
    }
}

public class yeild {
    public static void main(String[] args) {
        javaYeild j1=new javaYeild();
        javaYeild j2=new javaYeild();
        j1.start();
        j2.start();
        for (int i=0;i<5;i++){
            j2.yield();
            System.out.println(Thread.currentThread().getName()+" in control 2 ");
        }
    }
}
