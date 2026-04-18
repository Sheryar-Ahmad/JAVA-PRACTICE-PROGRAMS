import java.util.Arrays;

public class ChangingPositiionOfAlphabets {
    public static void main(String[] args) {
        String str="abc123pqr45xyz";
        //we have to print like the following way zyx123rqp45cba just reversing the alphabets and also changing the
        //their position

        int left=0;// we will check each element from the left whether it is digit or alphabet and also we have to swap the elements
        int right=str.length()-1; // The same way we will check from the right side

        System.out.println(str);
        char []ch=str.toCharArray();

        while(left<right){
            if (Character.isDigit(ch[left])){
                left++;
            }else if (Character.isDigit(ch[right])){
                right--;
            }else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
        //System.out.println(Arrays.toString(ch));
    }
}
