package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    static void main() {
        int [][]arr=new int[2][3];
//        arr[0][1]=10;
//        taking input by user;
        System.out.println("Enter the Element on Array !");
        Scanner sc=new Scanner(System.in);
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
