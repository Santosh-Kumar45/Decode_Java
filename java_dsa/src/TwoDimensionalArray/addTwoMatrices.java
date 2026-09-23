package TwoDimensionalArray;

public class addTwoMatrices {
    static void main() {
        int [][]a={{2,4},{55,3}};
        int [][]b={{4,6},{3,6}};

        int m=a.length;
        int n=b[0].length;

        int [][]res=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
