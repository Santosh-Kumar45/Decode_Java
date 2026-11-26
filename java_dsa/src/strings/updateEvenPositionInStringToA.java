package strings;

public class updateEvenPositionInStringToA {
    static void main() {
        String s="santosh";
        String str="";
        int n=s.length();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                str+='a';
            }
            else{
               str+= s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
