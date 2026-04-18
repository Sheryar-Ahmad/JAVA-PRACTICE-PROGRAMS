import java.util.Scanner;

public class Simple_Menu_Driven_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--Simple Calculator--");
        System.out.println("What you want to Perform");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Two Number");
                System.out.println("First Number");
                int a=sc.nextInt();
                System.out.println("Second Number");
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("Sum:"+sum);
                break;
            case 2:
                System.out.println("Enter Two Number");
                System.out.println("First Number");
                a = sc.nextInt();
                System.out.println("Second Number");
                b=sc.nextInt();
                if(b==0){
                    System.out.println("Denomentor cannot be zero");
                    break;
                }else{
                    int substract=a-b;
                    System.out.println("Difference:"+substract);
                    break;
                }

            case 3:
                System.out.println("Enter Two Number");
                System.out.println("First Number");
                a = sc.nextInt();
                System.out.println("Second Number");
                b=sc.nextInt();
                int mul=a*b;
                System.out.println("Multiply:"+mul);
                break;

            case 4:
                System.out.println("Enter Two Number");
                System.out.println("First Number");
                a = sc.nextInt();
                System.out.println("Second Number");
                b=sc.nextInt();
                int Div=a/b;
                System.out.println("Division:"+Div);
                break;
        }

    }
}
