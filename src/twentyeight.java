import java.util.Arrays;

public class twentyeight {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ordered Array"+Arrays.toString(array));
        int []reverse=new int[array.length];
       int index=0;

       for(int i= array.length-1;i>=0;i--){
           reverse[index]=array[i];
           index++;
       }
        System.out.println("Reverse Array"+Arrays.toString(reverse));
        Arrays.sort(reverse);

        System.out.println("Again Sorted"+Arrays.toString(reverse));
    }
}
