package TwoDimensionalArray;

public class printMatrixInSprialForm {
    static void main(String[] args) {
        int [][]arr={{11,12,33,44,55},{66,77,88,99,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //sprial print
        int minr=0,maxr=m-1;
        int minc=0,maxc=n-1;
        while (minr<=maxr && minc<=minc){
            //left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            //top to bottom
            if(minr>maxr || minc>maxc)break;

            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            //right to left
            if(minr>maxr || minc>maxc)break;

            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            //top to bottom
            if(minr>maxr || minc>maxc)break;
            
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }

    }
}


