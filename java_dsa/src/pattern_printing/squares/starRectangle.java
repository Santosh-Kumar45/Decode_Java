package pattern_printing.squares;

import java.util.Scanner;

public class starRectangle {
    public static void main() {
        System.out.println("Enter row's and col's : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <= n; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}