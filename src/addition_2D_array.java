import java.util.Scanner;
public class addition_2D_array {
    public static void main(String[] args) {
        int [][]matrix1=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for the matrix1 you want to add");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        int [][]matrix2=new int[2][3];
        System.out.println("Enter the values for the matrix2 you want to add");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j< matrix2[i].length;j++){
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        int [][]matrix3=new int[2][3];
        for(int i=0;i<matrix3.length;i++){
            for(int j=0;j<matrix3[i].length;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("The Result of the two matrices is:");
        for(int i=0;i< matrix3.length;i++){
            for(int j=0;j<matrix3[i].length;j++){
                System.out.print(matrix3[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
