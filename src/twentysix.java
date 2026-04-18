import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class twentysix {
    public static void main(String[] args) {
    //    int [][]array={{1,2,3},{4,5,6},{7,8,9}};

        //Rows of the 2D arrays
//        System.out.println(array.length);
        //Columns of the 2D arrays
//        System.out.println(array[0].length);

        //for each loop
//        for (int x[]:array){
//            for (int y:x){
//                System.out.print(y+" ");
//            }
//        }


        //using normal for loop
//        int [][]shery={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//        for (int i=0;i<shery.length;i++){
//            for (int j=0;j<shery[i].length;j++){
//                System.out.print(shery[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Storing the integer, character , string and  the floating values in a single array
       // Object []obj={100,'S',"Shery",12.5};
       // System.out.println(Arrays.toString(obj));

        Scanner sc=new Scanner(System.in);
        Object []mixture=new Object[10];
        for (int i=0;i<mixture.length;i++){
            mixture[i]=sc.nextLine();
        }

        for(Object i:mixture){
            System.out.println(i);
        }
    }
}
