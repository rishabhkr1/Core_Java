public class laptop {
    String brand;
    double price;
    int size;
    String specification;
    String type;
    
public laptop(String brand, double price, int size, String specification, String type) {
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.specification = specification;
        this.type = type;
    }

void display(){
    System.out.println("Brand : "+brand);
    System.out.println("Price : "+price);
    System.out.println("Size : "+size);
    System.out.println("Specification : "+specification);
    System.out.println("Type : "+type);
}
    
}
