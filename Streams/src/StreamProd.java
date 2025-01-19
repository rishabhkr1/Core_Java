import java.util.*;
import java.util.stream.Collectors;
class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//
//    public static Product lowerCase(Product p) {
//        p.name = p.name.toLowerCase();
//        return p;
//    }
////
//    public static Product upperCase(Product p){
//        p.name=p.name.toUpperCase();
//        return p;
//    }
//
////
    public float getPrice() {
        return price;
    }
}

public class StreamProd {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",48000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));



        //List<String> ans=productsList.stream().map(String::toLowerCase).collect(Collectors.toList());



//        List<Product> totalPrice2 = productsList.stream()
//                .map(Product::upperCase)
//                .filter(p->p.price>30000)
//                .toList();
//        System.out.print(totalPrice2);
////
        List<Float> productPriceList = productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

//------------------------------------------------------------------------------------------------------------

//        Map<String, String> ss = new HashMap<>();
//        ss.put("sourabh", "kumar");
//        ss.put("jscj", "kumar");
//        ss.get("jscj");



        // Converting product List into Set
//        Set<Float> productPriceList3 = productsList.stream()
//                        .filter(product->product.price > 30000)
//                        .map(product->product.price)
//                        .collect(Collectors.toSet());
//        System.out.println(productPriceList3);



        // Converting List into Map
//        Map<Integer,String> productPriceMap=
//                productsList.stream()
//                        .collect(Collectors
//                                .toMap(p->p.id,p->p.name));
//        System.out.println(productPriceMap);


    }
}

