import java.util.Scanner;
public class starts_methods {
   static int add(int x,int y){
        int z;
        z=x+y;
        return z;
       // return (x+y);
    }
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Value for Addition");
        a=sc.nextInt();
        System.out.println("Enter the Second Value for Addition");
        b=sc.nextInt();
        //starts_methods obj=new starts_methods(); Formation of the object;
       // c=obj.add(a,b);
        c=add(a,b);
        System.out.println(c);
    }
}
