public class this_keyword3_Constructor_Chaining {

    /*
    Constructor chaining means that calling one constructor inside another constructor body in the same class
     */
     this_keyword3_Constructor_Chaining(){
        System.out.println("default Constructor");
    }

    this_keyword3_Constructor_Chaining(String str){
        this();
        System.out.println(str);
    }
    this_keyword3_Constructor_Chaining(String str,int x){
         this("Shery");
        System.out.println(str+" "+x);
    }

    public static void main(String[] args) {

         this_keyword3_Constructor_Chaining obj4=new this_keyword3_Constructor_Chaining("Ahmad",1000);
    }
}
