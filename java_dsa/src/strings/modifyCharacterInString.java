package strings;

public class modifyCharacterInString {
    static void main() {
        String s="hello";
        //change hello=heylo;

        s=s.substring(0,2)+'y'+ s.substring(3);
        System.out.println(s);
    }
}
