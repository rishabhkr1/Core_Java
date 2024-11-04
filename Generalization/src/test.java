public class test {
    public static void main(String[] args) {
        bike b1 = new bike("Z900", "Green", 140000);
        bike b2 = new bike("Z900", "Green", 140000);
        bike b3 = new bike("Z900", "Green", 140000);


        employee e1 = new employee("Rishi", "Microsoft", 100000);
        employee e2 = new employee("Rishi", "Microsoft", 100000);
        employee e3 = new employee("Rishi", "Microsoft", 100000);


        Object x[] = {b1, e1,b2,e2,b3,e3};
        for(int i=0;i<= x.length-1;i++) {
            System.out.println(x[i]);
        }

    }
}
