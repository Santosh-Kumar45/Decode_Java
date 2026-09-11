package arrays;

public class rollNumberOfStudent {
    static void main() {
        int []arr= {12,34,66,76};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
