import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str="silent";
        //Anagram means the words in which the positon of the alphabets are changed and another word is formed like
        // silent can make listen;
        String str1="listen";

       str= str.toLowerCase();
        str1=str1.toLowerCase();

        if (str.length()==str1.length()) {

            //Storing the string in the array
            char[] ch = str.toCharArray();
            char[] ch1 = str1.toCharArray();

            //Sorted the array so that we can compare them
            Arrays.sort(ch);
            Arrays.sort(ch1);


           boolean result= Arrays.equals(ch,ch1);
           if (result){
               System.out.println(str+" and "+str1+ "are Anagrams");
           }else {
               System.out.println(str+" and "+str1 +"not Anagrams");
           }

        }
    }
}
