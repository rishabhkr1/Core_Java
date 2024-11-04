package Interview;

public class linearsearch {
    public static void main(String[] args) {

        int []arr={10,15,20,25};
        int key=10;
        int result =-1;
        for(int i=0;i< arr.length;i++){
            if (arr[i]==key){
                result=i;
                break;
        }
        }
        if(result==-1){
            System.out.println("NotFound");
        }else{
            System.out.println("Found");
        }

    }
}
