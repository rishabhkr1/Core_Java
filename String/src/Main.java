public class Main {
    public static void main(String[] args) {
        String str1=new String();
        String str2=new String("Programmer");
        String str3=new String("Programmer");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        int n1=str1.hashCode();
        int n2=str2.hashCode();
        int n3=str3.hashCode();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(n2==n3);
        System.out.println(str2.equals(str3));

        int s=str2.length();
        System.out.println(s);

        System.out.println(str2.charAt(2));

        int c1=str2.indexOf('m');
        System.out.println(c1);

        System.out.println(str2.indexOf('m',c1+1));

        System.out.println(str2.lastIndexOf('m'));

        System.out.println(str2.substring(4));
        System.out.println(str2.substring(4,7));
    }
}