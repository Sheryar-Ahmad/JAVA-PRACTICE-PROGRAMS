import java.util.Arrays;

public class thirtyone {
    public static void main(String[] args) {
        //Bubble Sorting
        int []array={22,34,153,65,87,23,12,56,3,87,97,45};
        System.out.println("Before Sorting: "+Arrays.toString(array));
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]>array[j]){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: "+Arrays.toString(array));
    }
}
