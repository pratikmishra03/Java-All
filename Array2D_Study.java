import java.util.Scanner;

public class Array2D_Study {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Rows of Array :");
        int row = SC.nextInt();
        System.out.println("Enter the colomns of Array:");
        int col = SC.nextInt();
        int[][] Arr2D = new int[row][col];
        for (int i = 0; i < Arr2D.length; i++) {
            for (int j = 0; j < Arr2D[i].length; j++) {
                System.out.println("Emter Value @Arr2D[" + i + "][" + j + "]: ");
                Arr2D[i][j] = SC.nextInt();
            }
        }
        for (int i = 0; i < Arr2D.length; i++) {
            for (int j = 0; j < Arr2D[i].length; j++) {
                System.out.println(" Value @Arr2D[" + i + "][" + j + "]: " + Arr2D[i][j]);
            }
        }
        for (int i = 0; i < Arr2D.length; i++) {
            for (int j = 0; j < Arr2D[i].length; j++) {
                System.out.println(Arr2D[i][j]);
            }
            System.out.println("");
        }

    }
}
