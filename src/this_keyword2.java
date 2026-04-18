public class this_keyword2 {
    //this keyword is also used to implicitly call the methods
    void method1(){
        System.out.println("In Method 1");
    }

    /* if i want to display the method 1 when the method 2 is call so we can directly write it as method1() and in
    the memory it would be stored as this.method1() and also we can write as this.method()1 and in method2().
     */
    void method2(){
       // method1();  it is also true and correct
        this.method1(); // it also correct
        System.out.println("In Method 2");
    }


    public static void main(String[] args) {

         this_keyword2 obj2=new this_keyword2();
         obj2.method2();
    }
}
