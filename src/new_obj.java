import java.util.Scanner;
class Bike{
    String name;
    String model;
    String color;
    int reg;
    Bike(String name,String model,String color,int reg){
        this.name=name;
        this.model=model;
        this.color=color;
        this.reg=reg;
    }
void display(){
    System.out.println("Bike:"+name+" "+model+" "+color+" "+reg);
}
}
public class new_obj {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the Bike");
        String name1= sc.nextLine();
        System.out.println("Enter the Model of the Bike");
        String model=sc.nextLine();
        System.out.println("Enter the Color of the Bike");
        String color=sc.nextLine();
        System.out.println("Enter the Registration Number of the Bike");
        int reg=sc.nextInt();

        Bike detail=new Bike(name1,model,color,reg);
         detail.display();


    }
}
