package arrays;

public class swappingArray {
    static void main() {
        int []arr=new int[25];
        arr[0]=100;
        arr[24]=200;
        int temp=arr[24];
        arr[24]=arr[0];
        arr[0]=temp;
        System.out.println(arr[0]+" "+arr[24]);
    }
}
