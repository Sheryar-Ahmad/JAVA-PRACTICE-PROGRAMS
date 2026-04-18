import java.util.*;

public class TableGenerator {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc=new Scanner(System.in);
         do{
            System.out.println("--Table Generator--");
            System.out.println("Enter the Number you want its Table");
            int number = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println("" + number + "x" + i + "=" + number * i);
            }
            System.out.println("Do you want to do it again(1/0)");
            choice=sc.nextInt();
        }while (choice!=0);
    }
}
