public class Showing_SortedArray_In_Descending {
    public static void changes(int []array,int i,int j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;

        }
    public static void print(int []array,int n){
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};
        int n=array.length;
        int i=0,j=n-1;
        print(array,n);
        while (i<j) {
            changes(array, i, j);
            i++;
            j--;
        }
        System.out.println();
        print(array,n);
        }
    }

