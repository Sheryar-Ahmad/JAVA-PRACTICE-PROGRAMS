public class nineteen {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9};
        int maximum=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>maximum){
                maximum=array[i];
            }
        }
        System.out.println(maximum);
    }
}
