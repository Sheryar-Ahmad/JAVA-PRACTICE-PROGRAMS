import java.util.Arrays;

public class Entering_data_in_array_without_lossing_data {
    //Inserting the element 10 in the place of the 3 but not losing the 3
    public static void main(String[] args) {
        int []array = {1, 2, 3, 4, 5, 0, 0, 0, 0};
        int count=0;
        for (int i=0;i< array.length;i++){
            if (array[i]!=0){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
        for (int i=count;i>2;i--){
            array[i]=array[i-1];

        }
        array[2]=10;

        System.out.println(Arrays.toString(array));

    }
}