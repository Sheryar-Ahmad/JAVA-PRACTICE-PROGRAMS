public class Pattern_1newline22_newline333 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //prints spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
