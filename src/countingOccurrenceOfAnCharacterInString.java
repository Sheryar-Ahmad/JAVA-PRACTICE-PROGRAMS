import java.util.Scanner;
public class countingOccurrenceOfAnCharacterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Java Programming Language is Object Oriented";
        System.out.println(str);
        System.out.println("Enter the Character You want its Occurence in the String");
        char ch=sc.next().charAt(0);

        int length=str.length();
        int temp=str.replace(ch+"","").length();

        int count=length-temp;
        System.out.println(count);

    }
}
