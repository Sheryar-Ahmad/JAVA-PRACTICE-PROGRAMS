public class Sorted_Array {
    public static void main(String[] args){
        int []array={1,2,3,4,5,6,7,8,9,10};//{1,3,4,2,5,7,8,10,9};
        boolean isSorted=true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is Not sorted");
        }
    }

}
