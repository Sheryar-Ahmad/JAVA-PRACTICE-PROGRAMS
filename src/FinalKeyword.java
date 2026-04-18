//final //declaring the test class as final then it can't be inherited or extended
class test{
final int a =100;
//with the final keyword with the variable it gives error when value is changed
  // final
   void display(){     // without finale keyword it can be override but with final it can't
        System.out.println("I am in the parent class");
    }
}
class child extends test{
    void display(){
        System.out.println("I am in the child class");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

        test obj1=new test();
        System.out.println(obj1.a);
        //obj1.a=200;
        //without the final keyword with the variable a its value can be changed
       // System.out.println(obj1.a);

        obj1=new child();
        obj1.display();
    }
}
