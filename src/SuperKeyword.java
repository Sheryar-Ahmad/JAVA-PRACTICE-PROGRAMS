class Car{
    Car(){
        System.out.println("Car default constructor");
    }
    int speed=100;
    void accelerate(){
        System.out.println("Accelerate in the parent class");
    }

}
class BMW extends Car{

    BMW (){
        super();
        System.out.println("BMW default constructor");
    }
    int speed =150;

    void accelerate(){
       // System.out.println("Accelerate in the child class");
        //if we want to call the parent class accelerate then we would use the super keyword
        super.accelerate();//now the immediate parent class accelerate would be call
    }

    void display(){
       // System.out.println(speed);//for child class
        System.out.println(super.speed);// here the immediate parent class speed would be called
    }
}
public class SuperKeyword {
    public static void main(String[] args) {

        BMW obj=new BMW();
        //obj.display();//here it calls the child class speed and display it and overidding has been happened
        obj.accelerate();
    }
}
