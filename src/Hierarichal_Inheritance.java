class Parent{
    int a=10;
    void display(){
        System.out.println("I am in the parent class "+a);
    }
}
class CHILD1 extends Parent{
    int b = 20;

    void print() {
        System.out.println("I am in the CHILD1 class extended from Parent class " + b);
    }
}
class CHILD2 extends  Parent{
    int c=30;
    void show(){
        System.out.println("I am in the CHILD2 class extended from Parent class  "+ c);
    }
}
//the hierarchal inheritance is used when you want to the property of only the parent class as shown in the program

public class Hierarichal_Inheritance {
    public static void main(String[] args) {
        CHILD1 obj=new CHILD1();
        obj.display();//belongs to the Parent class
        obj.print();//belongs to the CHILD1 class


        CHILD2 obj1=new CHILD2();
        obj1.display();//belongs to the Parent class
        obj1.show();//belongs to the CHILD2 class

    }
}
