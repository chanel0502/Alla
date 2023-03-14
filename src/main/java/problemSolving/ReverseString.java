package problemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter word");
        String word = user.nextLine();
        String reverse = "";

        for(int i = word.length()-1; i >= 0;i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
