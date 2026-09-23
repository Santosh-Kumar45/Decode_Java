package TwoDimensionalArray;

public class maxInArray {
    static void main() {
        int [][]arr={{1,-2,3},{3,200,5},{55,6,3}};
        int mx=Integer.MIN_VALUE;

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                mx=Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
