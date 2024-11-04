public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("test");
        System.out.println(sb2);
        StringBuilder sb3=new StringBuilder("test");
        System.out.println(sb3);


        int n1=sb1.hashCode();
        int n2=sb2.hashCode();
        int n3=sb2.hashCode();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(sb2.equals(sb3));

        String s1= sb2.toString();
        String s2= sb3.toString();
        System.out.println(s1.equals(s2));

        System.out.println(sb2.toString().equals(sb3.toString()));


        String a="123";
        String b="123";
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        System.out.println(a+b);//a+b will be concat
        System.out.println(x+y);//x+y will be added


    }
}
