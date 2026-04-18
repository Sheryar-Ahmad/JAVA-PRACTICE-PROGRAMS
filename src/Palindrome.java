import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String to check whether it is palindrome or not");
        String str=sc.nextLine();

        String rev=""; // first we will take reverse of the string if it is equal to the oriningal one then it is palindrome
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if (str.equalsIgnoreCase(rev)){
            System.out.println(str+" : is Palindrome");
        }else{
            System.out.println(str+" : is not a Palindrome");
        }
    }
}
