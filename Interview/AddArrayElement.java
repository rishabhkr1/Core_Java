package Interview;

public class AddArrayElement {
    public static void main(String[] args) {
        int []arr={2,5,67,5,7};
        int n= arr.length;
        for(int i= n;i>0;i--){
            arr[i]=arr[i+1];
        }
        arr[2]=3;
        n++;
        System.out.println(arr);
    }

}
