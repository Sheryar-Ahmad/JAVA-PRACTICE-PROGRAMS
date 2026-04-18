class parent{
    int a=10;
    void display(){
        System.out.println("I am in the parent class "+a);
    }
}
class child1 extends parent {
    int b = 20;

    void print() {
        System.out.println("I am in the child 1 class extended from parent class " + b);
    }
}
class Child2 extends child1{
    int c=30;
    void show(){
        System.out.println("I am in the child 2 class extended from child 1  "+ c);
    }
}
public class Multilevel_Inheritenec {
    public static void main(String[] args) {

      /*  child1 obj=new child1();//Child1 class
        System.out.println(obj.a);//belongs to parent class
        System.out.println(obj.b);//belongs to child class
        obj.print();//belongs to child class
        obj.display();//belongs to parent class
       */

        Child2 obj=new Child2();
        obj.display();//belongs to parent class
        obj.print();//belongs to child1 class
        obj.show();//belongs to child2 class

    }
}
