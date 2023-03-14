package practice;

import java.util.Scanner;

public class LenghtLonger {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter word");

        String a = user.nextLine();
        String b = user.nextLine();

        if (a.length()>b.length()){
            System.out.println(b + ":" + a.length()) ;
        }
        else if (b.length()>a.length()){
            System.out.println(a + ":" +b.length());

        }else
            System.out.println(a + " " + b + ":" + a.length());

    }
}
