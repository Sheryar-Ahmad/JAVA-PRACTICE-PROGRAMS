import java.util.Arrays;

public class QuickSort {
    public static int partition(int []array,int start,int end) {
        int index=start-1,pivot=array[end];

        for (int i=start;i<end;i++){
            if (array[i]<=pivot){
                index++;
                int temp=array[i];
                array[i]=array[index];
                array[index]=temp;

            }
        }
        index++;
        int temp=array[end];
        array[end]=array[index];
        array[index]=temp;
     return index;
    }

    public static void QUICKSORT(int []array,int start,int end) {
        if (start<end){
        int idxpivot=partition(array,start,end);
        QUICKSORT(array,start,idxpivot-1);
        QUICKSORT(array,idxpivot+1,end);
        }
    }
    public static void main(String[] args) {
        int []array={9,8,7,6,5,4,3,2,1};
        int start=0;
        int end=array.length-1;
        QUICKSORT(array,start,end);
        System.out.println(Arrays.toString(array));
    }
}
