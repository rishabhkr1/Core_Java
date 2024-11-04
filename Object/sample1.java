
public class sample1 {
    int x;
    sample1(){
        x=200;
        System.out.println(x);
    }
}
class mainclass1{
    public static void maiin(String[] args){
        sample1 s1=new sample1();
        System.out.println(s1.x);
    }
}
