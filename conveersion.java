import java.util.Scanner;

public class conveersion {

    public static void main(String[] args) {
        System.out.println("***Explicit Conversion***");
        // try (Scanner SC = new Scanner(System.in)) {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.println("Enter floating number");
            float myNum = SC.nextFloat();
            int myint = (int) myNum;
            System.out.println("  floating value " + myNum);
            System.out.println("  Integer value " + myint);
            System.out.println("***Implicit Conversion***");
            int num = SC.nextInt();
            System.out.println("Enter integer number");
            float myNum2 = (float) num;
            System.out.println("   Integer value " + num);
            System.out.println("   Floating valu " + myNum2);
        }

    }

}
