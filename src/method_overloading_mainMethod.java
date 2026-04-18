public class method_overloading_mainMethod {
   void main(){
       System.out.println("Without Inputs");
    }
    void main(String x){
        System.out.println("With the parameters: "+x);
    }
    void main(int a,float b){
        System.out.println("With the parameters "+ a+" "+"and "+ b);
    }
    public static void main(String[] args) {
        method_overloading_mainMethod obj=new method_overloading_mainMethod();
        obj.main();
        obj.main("Sheryar");
        obj.main(10,20.5f);
    }
}
