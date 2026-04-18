import java.util.Scanner;

public class SimpleLinearSearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the Size of the Array");
        size=sc.nextInt();

        System.out.println("Enter the values in the Array");
        int []array=new int[size];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the Value that you want to find in the array");
        int find=sc.nextInt();

        //linear searching
        for (int i=0;i< array.length;i++){
            if (array[i]==find){
                System.out.println("The Number is present on the index:"+i);
            }
        }
    }
}
