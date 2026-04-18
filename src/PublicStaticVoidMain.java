public class PublicStaticVoidMain {

    void function(String [] args){
        int length=args.length;
        System.out.println(length);

        for (String str:args){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

//        int length= args.length;
//        System.out.println(length);
//        for (String str:args){
//            System.out.println(str);
         PublicStaticVoidMain obj=new PublicStaticVoidMain();

         obj.function(args);

        }
    }

