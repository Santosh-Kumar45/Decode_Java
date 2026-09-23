package TwoDimensionalArray;

public class sumOfAllElementInArray {
    static void main() {
        int [][]arr={{1,-2,3},{3,200,5},{55,6,3}};

        int sum=0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
