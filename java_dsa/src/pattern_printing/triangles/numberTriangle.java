package pattern_printing.triangles;

import java.util.Scanner;

public class numberTriangle {
    static void main() {
        System.out.println("Enter row's : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
