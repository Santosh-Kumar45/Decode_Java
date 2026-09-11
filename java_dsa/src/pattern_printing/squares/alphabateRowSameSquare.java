package pattern_printing.squares;

import java.util.Scanner;

public class alphabateRowSameSquare {
    static void main() {
        System.out.println("Enter row's and col's : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= m;j++ ) {
                System.out.print((char)(64+i)+" ");
            }

            System.out.println();
        }
    }
}
