public class Main {
    public static void main(String[] args) {
        employee e1=new employee();
        e1.setId(654);
        e1.setName("Rishi");
        e1.setSalary(25000.00);

        System.out.println("ID : "+e1.getId());
        System.out.println("Name :"+e1.getName());
        System.out.println("Salary : "+e1.getSalary());
    }
}