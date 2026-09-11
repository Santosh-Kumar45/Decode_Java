package arrays;
import java.util.*;

public class outputOfArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.println("enter number in array");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
