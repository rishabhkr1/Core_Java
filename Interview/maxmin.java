package Interview;

public class maxmin {
    public static void main(String[] args) {
        int arr[]={20,25,85,31,2};
//        int min=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }

}
