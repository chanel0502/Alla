package practice;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter word");
        String str = user.nextLine();

        System.out.println(str.toUpperCase());




    }

}
