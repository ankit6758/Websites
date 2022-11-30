package PatternProgram;

import java.util.Scanner;

public class Tringlesecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int row = n; row >=1 ; row--) {
            for (int column = 0; column <row ; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row <n ; row++) {
            for (int column = 0; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
