import java.util.Scanner;

public class sumOfOddFromOneToN {
    static int oddSum(int num) {
        int sum=0;
        for (int i = 1; i <= num; i=i+2) {
        sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter any number to find the sum of odd from 1 to n");
        number=sc.nextInt();
        int result=oddSum(number);
        System.out.println("The Sum of Odd to n is :"+result);
        //System.out.println(result);

    }
}
