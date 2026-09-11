package pattern_printing.specialPatterns;

import java.util.Scanner;

public class floydTriangle {
    static void main() {
        System.out.println("Enter row's : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a=1;
        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <= i; j++) {
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
