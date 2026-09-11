package arrays;

import java.util.Scanner;

public class linearSearch {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target element : ");
        int num=sc.nextInt();
        System.out.print("enter size of array : ");
        int n=sc.nextInt();
        int []arr=new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==num){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }
    }
}
