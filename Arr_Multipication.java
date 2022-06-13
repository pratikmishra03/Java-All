import java.util.Scanner;

public class Arr_Multipication {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        // taking input for first matrix

        System.out.println("Taking input for first Matrix");
        System.out.println("Enter Numbers of row");
        int row_A = SC.nextInt();
        System.out.println("Enter Numbers of colom");
        int col_A = SC.nextInt();
        int[][] Array_A = new int[row_A][col_A];
        for (int i = 0; i < Array_A.length; i++) {
            for (int j = 0; j < Array_A[i].length; j++) {
                System.out.println("Enter value of firstArray : [" + i + "][" + j + "]");
                Array_A[i][j] = SC.nextInt();

            }
        }
        // taking input for second matrix
        System.out.println("Taking input for Second Matrix");
        System.out.println("Enter Numbers of row");
        int row_B = SC.nextInt();
        System.out.println("Enter Numbers of colom");
        int col_B = SC.nextInt();
        int[][] Array_B = new int[row_B][col_B];
        for (int i = 0; i < Array_B.length; i++) {
            for (int j = 0; j < Array_B[i].length; j++) {
                System.out.println("Enter value of firstArray : [" + i + "][" + j + "]");
                Array_B[i][j] = SC.nextInt();
            }
        }

        // PERFORMING MULTIPLICATION

        int[][] Array_new = new int[row_A][col_B];
        if (col_A == row_B) {
            for (int i = 0; i < Array_new.length; i++) {
                for (int j = 0; j < Array_new[i].length; j++) {
                    Array_new[i][j] = 0;
                    for (int k = 0; k < Array_new[i].length; k++) {
                        Array_new[i][j] += Array_A[i][k] * Array_B[k][j];
                    }
                }
            }

            // PRINTING THE ARRAY

            System.out.println("");
            System.out.println("Resultant Matrix = ");
            for (int i = 0; i < Array_new.length; i++) {
                for (int j = 0; j < Array_new[i].length; j++) {
                    System.out.print("\t" + Array_new[i][j]);
                }
                System.out.println("");
            }
        } else {
            System.out.println("Can't Multiply the Matrices since they do not have same order !!!");
        }

    }
}
