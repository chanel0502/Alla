package loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int digit;
        String word;


        do {
            System.out.println("Enter string :");
            word = user.nextLine();
            digit = 0;

            for(int i = 0; i < word.length(); i++) {
                 {
                    System.out.println(digit + " digits");
                }
            }
            }while (digit == 3);
        System.out.println("You entered a word with 3 digits!");

    }
}
