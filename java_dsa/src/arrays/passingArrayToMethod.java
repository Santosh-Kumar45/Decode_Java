package arrays;

public class passingArrayToMethod {
    static void main() {
        int []arr={10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[]arr){
        arr[0]=100;
    }
}
