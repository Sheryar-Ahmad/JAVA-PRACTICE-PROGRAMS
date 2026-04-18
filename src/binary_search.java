import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []array=new int[100];
        int high,low,mid;
        int size,search,elements;

        System.out.println("Enter the Size of the array");
        size=sc.nextInt();

        System.out.println("Enter the Elements of the Array");
        for(int count=0;count<size;count++){
            array[count]=sc.nextInt();
        }

        System.out.println("Enter the Element that you want Search");
        search=sc.nextInt();

        low=0;
        high=size-1;
        int found=0;
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]==search){
                System.out.println("The number is Found");
                found=1;
                break;
            }else if(array[mid]<search){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(found==0){
            System.out.println("The Element You Enter is Not Present");
        }
    }
}
