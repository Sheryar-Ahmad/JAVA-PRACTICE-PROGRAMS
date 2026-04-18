public class twentyone {
        public static void main(String[] args) {
        //x=4
        int []array={21,12,34,50,40,10};
        int target=50;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    System.out.println("Found on the index:"+i+ "and"+j);
                }
            }
        }
    }
}
