package TwoDimensionalArray;

import org.w3c.dom.ls.LSOutput;

public class printTwoDArray {
    static void main() {
        int [][]arr={{1,-2,3},{3,200,5},{55,6,3}};


        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}
