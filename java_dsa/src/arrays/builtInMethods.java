package arrays;

import java.util.Arrays;
public class builtInMethods {
    static void main() {
        int []arr={2,33,53,2,5,20};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
        }
    }
}
