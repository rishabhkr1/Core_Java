import jdk.internal.dynalink.beans.StaticClass;

public class coffee {
    String name="Espresso";
    int price=250;
    public String toString(){
        return this.name+"  "+this.price;
    }
}
class tea{
    String name="latte";
    int price=350;
    public String toString(){
        return this.name+" "+this.price;
    }
}
class colddrink{
    String name="Pepsi";
    int price=25;
    public String toString(){
        return this.name+" "+this.price;
    }
}
