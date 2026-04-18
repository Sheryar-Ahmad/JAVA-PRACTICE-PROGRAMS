public class new_one {
    public static void main(String[] args) {

        int [] array={5,10,20,40,50};
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++) {
                if (array[i] + array[j] == 50) {

                    System.out.println(i+" And "+j);
                    break;
                }
            }
        }
    }
}
