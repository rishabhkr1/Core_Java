package basic;

public class reverseofString {
    public static void main(String[] args) {

        // 1st Method
//        StringBuilder str= new StringBuilder("Developer");
//        System.out.println("Original String : "+str);
//        str.reverse();
//        System.out.println("Reversed String : "+str);

        // 2nd Method
        String str1="abba";
        String str2=str1;
        String rev="";
        System.out.println("Given String : "+str1);
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reversed String : "+rev);
        if (rev.equals(str2)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is Not Palindrome");
        }

        //
    }
}
