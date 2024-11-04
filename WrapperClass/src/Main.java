public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Integer i1=new Integer(100);
        Integer i2=new Integer(100);
        System.out.println(i1);
        System.out.println(i2);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(i1.equals(i2));

        int n1=i1.intValue();
        int n2=i2.intValue();
        System.out.println(n1+" "+n2);

        Integer i3=100;
        Integer i4=500;
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i3+i4);

        int res=i3+i4;
        System.out.println("Result "+res);
        Integer result=i3+i4;
        System.out.println(result);
    }
}