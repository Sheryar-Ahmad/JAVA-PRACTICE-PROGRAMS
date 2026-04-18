class Base{
    void m1(String str){ //method signature
        System.out.println("In parent class "+str);
    }

    void m2(String s){
        System.out.println(s);
    }
}
class SubClass extends Base{
    @Override
    void m1(String str){//overriding
        System.out.println(str+"Child class method");
    }

    //we can overload the method also and we are now doing it by changing
    //the parameter of the m2
    void m2(String str1,String str2){   //this is overloading
        System.out.println(str1+str2);
    }
}
public class Overloading_Vs_Overriding {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.m1("Sheryar");//overriding method in the child class
        obj.m2("Ahmad");//overloaded method from the parent class
        obj.m2("Khan","Ahmad");//it is an overloaded method2
    }
}
