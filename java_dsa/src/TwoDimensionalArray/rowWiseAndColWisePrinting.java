package TwoDimensionalArray;

public class rowWiseAndColWisePrinting {
    static void main() {
        int [][]arr={{5,3},{2,4},{4,6}};
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
//        for(int j=0;j<n;j++){
//            for (int i = 0; i < m; i++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


        int [][]transpose=new int[n][m];
        for(int i=0;i<n;i++){
            for (int j = 0; j <m; j++) {
               transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
