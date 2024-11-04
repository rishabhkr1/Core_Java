public class father {
     void drink(){
        System.out.println("Coffee");
    }
}
class son extends father{
     void drink(){
        System.out.println("Tea");
    }
}
class daughter extends father {
     void drink() {
        System.out.println("Horlicks");
    }


    public static void main(String[] args) {
        father f1 = new son();
        f1.drink();

    }
}