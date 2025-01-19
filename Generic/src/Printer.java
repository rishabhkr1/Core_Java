public class Printer <T,V>{
    T thingsToPrint;
    V otherThings;
    public Printer(T thingsToPrint,V otherThings){
        this.thingsToPrint=thingsToPrint;
        this.otherThings=otherThings;
    }
    public void print(){
        System.out.println(thingsToPrint);
        System.out.println(otherThings);
    }

    public static void main(String[] args) {
        Printer<Integer,String> data=new Printer<>(1,"Rishabh");
        data.print();
    }

}