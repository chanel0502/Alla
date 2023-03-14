package problemSolving;

import java.util.Scanner;

public class LettersFrequency {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = user.nextLine();


        for (int i = 0; i < word.length(); i++){
           int counter  = 0;
           for (int b = 0; b < word.length(); b++){

           if (word.charAt(i) == word.charAt(b)){
               counter++;
            }
        }
            System.out.println(word.charAt(i) + " : " + counter);
        }
    }
}
