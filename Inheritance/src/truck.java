public class truck extends vehicle {

    truck(String name,String color,int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }

    public static void main(String[] args) {
        truck t1=new truck("Tata","Brown",2500000);
        t1.display();
    }
}
