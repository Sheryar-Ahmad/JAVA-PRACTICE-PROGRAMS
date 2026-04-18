import java.util.Scanner;
public class search_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[100];
        int size;
        int search;
        int flag=0;
        System.out.println("Please Enter The Size Of The Array");
        size=sc.nextInt();
        System.out.println("Please Enter The Elements Of The Array");
        for(int count=0;count<size;count++){
            array[count]=sc.nextInt();
        }
        System.out.println("Please Enter The Element You Want To Search");
        search=sc.nextInt();

        for(int count=0;count<size;count++){
            if(search==array[count]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("The ELement Is Present");
        }
        else {
            System.out.println("The Element Is Not Present");
        }

    }
}
