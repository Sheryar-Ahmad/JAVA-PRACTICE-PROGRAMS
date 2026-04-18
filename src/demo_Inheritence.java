class A{
    int a=10;
    void display(){
        System.out.println(a);
    }
}
class B extends A{
    int b=20;
    void print(){
        System.out.println(b);
    }
}

public class demo_Inheritence {
    public static void main(String[] args) {

        A obj= new A();// using the parent class we cannot access the child class
        obj.display();// belongs to the class A

        B obj1=new B();//using the child class we can access the parent class
        obj1.display();//belongs to class A
        obj1.print();// belongs to class B

    }
}
