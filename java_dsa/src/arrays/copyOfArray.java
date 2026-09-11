package arrays;

import java.util.Arrays;

public class copyOfArray {
    static void main() {
        int []arr={10,20,30,40};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int []num=arr;
        num[0]=100;
        System.out.println(arr[0]);     //shallow copy

        int []brr=Arrays.copyOf(arr,arr.length);
        brr[0]=30;
        System.out.println(arr[0]);    //deep copy

    }
}
