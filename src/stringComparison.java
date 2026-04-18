import java.util.StringTokenizer;

public class stringComparison {
    public static void main(String[] args) {
        // Example 1:
        String s1="Sheryar";
        String s2="Sheryar";
       // System.out.println(s1);
        //s1="Ahmad";
      //  System.out.println(s1);
          /* as these values, the strings are stored in the string constant pool
        SCP when they are directly given the values and SCP is the part of the Heap memory and it also there is
        another point that once the constant is stored in one String variable and there is another
        String variable with the same constant so in the String Constant pool another Constant is not created
        but that variable just point to that variable that has the same value or the constant  as shown in the above*/

       // System.out.println(s1==s2);// gives a boolean value that would be true as both are pointing the value
       // System.out.println(s1.equals(s2));

        //Example 2:
        String s3="Welcome";
        //Stored inside the SCP String Constant Pool
        String s4=new String("Welcome");
        //Stored inside the Heap Memory
        System.out.println(s3==s4); // they will return a boolean false value as on is stored inside the SCP and the other is stored inside the Heap memory .
        System.out.println(s3.equals(s4));// equals just compare the values and the == comapre the objects

        //Example 3:
        String s5=new String("Hello");//Stored inside the heap memory but not at the same place as the s6 and points to s5 objects
        String s6=new String("Hello");//stored inside the heap memory but it references to the s6 object
        System.out.println(s5==s6);// gave a boolean false as they both are not of the same object and there objects are different
        System.out.println(s5.equals(s6));//gaves a boolean true as equals methods just only compare the values


    }
}
