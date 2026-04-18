import java.util.Scanner;

public class thirty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array={20,30,40,20,50,60,20,80,90};
        int count=0;
        System.out.println("Enter the element you want to find its count of duplicated values");
        int element = sc.nextInt();
        for (int x:array){
            if (x==element){
                count++;
            }
        }
        System.out.println(count);
    }
}
