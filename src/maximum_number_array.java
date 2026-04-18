import java.util.Scanner;
public class maximum_number_array {
    public static void main(String[] args) {
        int []array={12,15,17,56,34,23};
        int location=0;
        int maximum=array[0];
        for(int count=0;count<array.length;count++){
            if(array[count]>maximum){
                maximum=array[count];
                location++;
            }
        }
        System.out.println(maximum);
        System.out.println("The Maximum Number Is Present At Location "+location);

    }
}
