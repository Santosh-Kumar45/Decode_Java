package arrays;

public class twoSum {
    static void main() {
        int []arr={1,2,4,5,6,-1};
        int x=9;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);

                }
            }
        }
    }

}
