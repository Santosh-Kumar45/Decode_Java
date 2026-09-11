package pattern_printing.specialPatterns;

import java.util.Scanner;

public class oddNumberTriangle {
    static void main() {
        System.out.println("Enter row's : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <=i; j++) {
                {
                    System.out.print(2*j-1+" ");
                }
            }
            System.out.println();
        }
    }
}
