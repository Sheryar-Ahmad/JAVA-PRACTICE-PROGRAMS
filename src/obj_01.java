import java.util.Scanner;
class Human{
    String name;
    float age;
    String Father_name;
    String address;
    int phone_number;
    String carrier;

    Human(String name,String Father_name,float age,String carrier,int phone_number,String address) {
        this.name = name;
        this.Father_name = Father_name;
        this.age = age;
        this.carrier = carrier;
        this.phone_number = phone_number;
        this.address = address;
    }
    void display(){
        System.out.println("Human:"+name+" "+Father_name);
        System.out.println("\tAge:"+age);
        System.out.println("\tJob:"+carrier);
        System.out.println("\tPhone_Number:"+phone_number);
        System.out.println("\tAddress:"+address);
    }
}
public class obj_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your best Name");
        String name=sc.nextLine();
        System.out.println("Enter your Father Name");
        String Father=sc.nextLine();
        System.out.println("Enter your Age");
        float age=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Your Carrier");
        String carrier=sc.nextLine();
        System.out.println("Enter your Phone_Number");
        int phone=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Address");
        String address=sc.nextLine();

        Human people=new Human(name,Father,age,carrier,phone,address);
        people.display();
        sc.close();
    }
}
