package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class arrayListsTwoD {
    static void main() {
        List<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        List<Integer> b=new ArrayList<>();
        b.add(50);
        b.add(60);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(70);


        List<List<Integer>> l=new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

        for(int i=0;i<l.size();i++){
            List<Integer>x=l.get(i);
            for(int j=0;j<x.size();j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }

    }
}

