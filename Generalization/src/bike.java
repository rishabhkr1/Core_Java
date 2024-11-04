public class bike {
    String model,color;
    int price;

    public bike(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return this.model+" "+this.color+" "+this.price;
    }
}
class employee{
    String name,company;
    int salary;

    public employee(String name, String company, int salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name+" "+this.company+" "+this.salary;
    }
}
