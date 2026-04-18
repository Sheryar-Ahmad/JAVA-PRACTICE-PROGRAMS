public class this_keyword3 {
    /*
    we can also use this keyword to invoke current class constructor
     */
    this_keyword3(){
        System.out.println("default constructor");
    }
    this_keyword3(String str){
        System.out.println(str);
    }
    this_keyword3(String str,int x){
        //this();// it would call the default constructor
        this("Shery");//it would call the second constructor thet is parametrized
        System.out.println(str+"  "+x);
    }

    public static void main(String[] args) {

        this_keyword3 obj3=new this_keyword3("Ahmad",100);

    }
}
