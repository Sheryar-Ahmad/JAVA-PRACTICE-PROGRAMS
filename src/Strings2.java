import java.util.Arrays;
import java.util.Locale;

public class Strings2 {
    public static void main(String[] args) {
        String str="Sheheryar";
        System.out.println(str.length()); // (1) Length method of the String

        String str1="Ahmad";
        String str2="Khan";

        System.out.println(str+str1); /*(2) Concat method of the Strings */
        System.out.println(str.concat(str1)); // method 2
        System.out.println(str.concat(str1).concat(str2)); // method 3


        String S1="  Ahmad Sheryar   "; // (3) trim() method of the Strings
        System.out.println(S1.trim());

        System.out.println(S1.charAt(8)); //(4) charAt() method of the Strings


        System.out.println(S1.replace("Ahmad","AHMAD")); //(5) Replace method of the String and
        // and it can also be used to replace a single character and even a String

        String S="Shery";//(6) Contains method of the Strings
        String SS="shery";
        System.out.println(S.contains(SS)); // it gave the boolean value of the false because of the mismatc and also
        // it just only used to the compare any part of the string as shown in the below code
        String Str4="her";
        System.out.println(S.contains(Str4));

        String St="Shery";//(7) equals method of the Strings
        System.out.println(S.equals(St)); // returns the true boolean value as both S and the St are same strings


        System.out.println(S.equalsIgnoreCase(SS));// (8) equalsIgnoreCase of the Strings method

        System.out.println(S.contentEquals(SS)); // (9) contentEquals method of the String
        //contentEquals work the same as the equlas method work okay!

        String A="ahmad";
        String B="KHAN";
        System.out.println(A.toUpperCase());// (10)toUpperCase method of the Strings which will convert all the letters to the capital
        System.out.println(B.toLowerCase());// (11)toLowerCase method of the Strings which will convert all the letters to the small


        String star="Solar System";
        System.out.println(star.substring(1));//(12)Substring method first that take only one index
        System.out.println(star.substring(1,5));// Substring method second that takes both the first and the last
        //index but only prints the letters that are before the last index and does not print the last index


        String shery="harry1122@gmail.com"; // (13) Split method() of the Strings that create multiple string of a string in
        // the bases of the words that is used to split the string and also the words that is used for splitting it is not shown in the output
        String []s=shery.split("@");
        System.out.println(Arrays.toString(s));





    }
}
