package arrays;

public class secondMaxInArray {
    static void main() {
        int []arr={10,20,30,40,50};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                smx=Math.max(smx,arr[i]);
            }
        }
        System.out.println("1st max value : " +max);
        System.out.print("2nd max value : "+smx);

    }
}
