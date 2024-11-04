package Interview;

public class reverseofnum {
    public static void main(String[] args) {
        int n=123654789;
        int rev = 0;
        while(n>0){
            int a=n%10;
             rev=rev*10+a;
            n=n/10;
        }
        System.out.println(rev);
    }
}