package loops;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter;

        do{
            System.out.println("Enter a string with 10 vowels");
            String word = scanner.nextLine();
            counter = 0;


            for( int i = 0; i < word.length(); i++){
                word = word.toLowerCase();

                if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'
                        || word.charAt(i) == 'e'){
                    counter++;
                }
            }
            System.out.println("The entered word's vowel count:" + counter);

        }while (counter != 10);
    }
}
