public class twenty {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
                System.out.println(smax);}
        }

//        int tmax=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>tmax && arr[i]!=max && arr[i]!=smax){
//                tmax=arr[i];            }
//        }
//        System.out.println(max);
//        System.out.println(smax);
//System.out.println(tmax);
    }
}
