//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object LOCK = new Object();
        Thread.sleep(1000);
        System.out.println(
                "Thread '" + Thread.currentThread().getName() +
                        "' is woken after sleeping for 1 second");

        synchronized (LOCK) {
            LOCK.wait(5000);
            System.out.println("Object '" + LOCK + "' is woken after" +
                    " waiting for 5 second");
        }


        //     Object LOCK = new Object();
//        synchronized (lock) {
//            System.out.println("First time acquiring it");
//
//            synchronized (lock) {
//                System.out.println("Entering again");
//
//                synchronized (lock) {
//                    System.out.println("And again");
//                }
//            }
//        }

    }
}