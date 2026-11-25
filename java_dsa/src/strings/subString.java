package strings;

public class subString {
    static void main() {
        String s="abcde";
        System.out.println(s.substring(2));
        //print 2 and aage wale indices
        System.out.println(s.substring(1,4));

        System.out.println("..................");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=5; j++) {
                System.out.println(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
