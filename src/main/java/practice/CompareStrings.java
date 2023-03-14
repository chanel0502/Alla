package practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter");

        String word = user.nextLine();
        String word2 = user.next();

        if(word.equals(word2)){
            System.out.println("Equal");

        }else{
            System.out.println("Not Equal");
        }
    }
}
