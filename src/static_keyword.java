//those variables that are declared with the static keyword does not require any object for calling it and also intializing it
public class static_keyword {
   //variables
    int rollnum;
    char grade;
    static String city;

  //  methods
    static void display1(){
        System.out.println("static display method");
    }

    void display2(){
        System.out.println("non static method");
    }

    public static void main(String[] args) {

        city="Peshware";
        // without creating the object for the city we can specify it
        // the same way we can call the display1() method without the object
        display1();

        static_keyword obj =new static_keyword();
        //for non-static variables we have created an object
        System.out.println(obj.rollnum);
        obj.display2();


        /*
        Note: if you have declared the variables like the static in the one class
        and want to use them in the another class then you have to use the class
        name with variable which one is made the static

        like if the in the above code we move the main class to another class then
        we have to use the static variables as

        static_keyword.city="peshware";
        System.out.println("static_keyword.city");

        static_keyword.display1();

        for static variables you have to use the class name in with variables
        System.out.println("static_keyword.city");
      */
    }
}
