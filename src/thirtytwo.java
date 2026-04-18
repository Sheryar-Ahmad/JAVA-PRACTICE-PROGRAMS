import java.util.Arrays;
            //QUICK SORT
public class thirtytwo {
    public static int partation(int []arr,int start,int end) {
        int index=start-1,  pivot=arr[end];
        for (int i=start;i<end;i++){
            if (arr[i]<=pivot){
                index++;
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        index++;
        int temp=arr[end];
        arr[end]=arr[index];
        arr[index]=temp;
        return index;

    }
        public static void quickSort(int []arr,int start,int end){
        if (start<end){
            int pivIdx=partation(arr, start, end);
            quickSort(arr,start,pivIdx-1);
            quickSort(arr,pivIdx+1, end);
        }
    }
    public static void main(String[] args) {
        int []array={9,8,7,6,5,4,3,2,1};
        int start=0;
        int end=array.length-1;

        quickSort(array,start,end);

        System.out.println(Arrays.toString(array));

    }
}
