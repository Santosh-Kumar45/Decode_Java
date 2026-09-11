package arrays;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class basicOfArrayList {
    static void main() {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);         //arr[2]=30;
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);

        arr.set(1,100);
        arr.remove(0);
        System.out.println(arr);

        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }


    }
}
