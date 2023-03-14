package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter anything");

        String word = user.nextLine();
        word = word.replace( " ", "");
        System.out.println(word);
    }
}
