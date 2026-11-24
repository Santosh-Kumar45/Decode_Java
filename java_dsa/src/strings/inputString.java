package strings;

import java.util.Scanner;

public class inputString {
    static void main() {
        System.out.println("Enter your name : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print("Hi "+str);

    }
}
