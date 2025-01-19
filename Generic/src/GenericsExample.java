public class GenericsExample {
    public static void main(String[] args) {
        shout("Rishabh ",455);

    }
    private static <T,V> void shout(T thingsToShout , V otherthingsToShout){
        System.out.println(thingsToShout);
        System.out.println(otherthingsToShout);
    }
}
