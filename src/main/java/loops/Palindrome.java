package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        String word = user.nextLine();
        int length = word.length();
        boolean isPalindrome = true;

        for( int i = 0; i < length / 2 ;i++){
            if(word.charAt(i) != word.charAt(length -1 -i)){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }
}
