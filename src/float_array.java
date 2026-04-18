import java.util.Scanner;
public class float_array {
    public static void main(String[] args) {
      float [] marks={12.5f,13.25f,14.7f,20.1f,15.75f};
      float sum=0;
      for(int i=0;i<marks.length;i++){
      sum=sum+marks[i];
      }
        System.out.println(sum);
    }
}
