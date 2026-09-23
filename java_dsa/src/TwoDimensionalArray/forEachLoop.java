package TwoDimensionalArray;

public class forEachLoop {
    static void main() {
        int [][]b={{1,2,3},{4,3,5}};

        for(int [] ele:b){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
