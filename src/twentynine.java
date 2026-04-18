import java.util.Scanner;

public class twentynine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array={1,2,3,4,5,6,7,8,9,10};
        int foundingElement;
        System.out.println("Enter the element you want to find in the array");
        foundingElement=sc.nextInt();
        boolean status=false;
//        for(int i=0;i< array.length;i++){
//            if (array[i]==foundingElement){
//                System.out.println("Element found in the array on the index: "+i);
//                status=true;
//                break;
//            }
//        }

        //Enhanced for loop
        for(int i:array){
            if (i==foundingElement){
                System.out.println("Element found in the array on the index: "+i);
                status=true;
                break;
            }
        }
        if (status==false){
            System.out.println("Element not found in the array");
        }
    }
}
