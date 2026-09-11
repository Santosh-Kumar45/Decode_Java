package arrays;


import static java.util.Collections.swap;

public class reverseArray {
    static void main() {
        int []arr={1,22,3,41,5,43,45,75,7};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[n-1-i]+" ");
        }



//        System.out.println();
        //two pointer    reverse
//        int i=0; int j=n-1;
//        while(i<=j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//        System.out.println();
    }
}
