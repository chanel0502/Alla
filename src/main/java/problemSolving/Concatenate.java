package problemSolving;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));
        System.out.println(word1.toUpperCase().charAt(0) +word1.substring(1)+ word2.toUpperCase().charAt(0)+ word2.substring(1));
        System.out.println(word1.toUpperCase() +" "+word2.toLowerCase() +" "+ word2.toLowerCase() +" "+ word1.toUpperCase());
        System.out.println((word1 + " " + word2).toUpperCase().replace("A",""));
        System.out.println(word1.toUpperCase().charAt(0) + word1.substring(1,2) + word2.toUpperCase().charAt(0)+word2.substring(1,2));

        System.out.println(""+ word1.toUpperCase().charAt(word1.length()-2)+word1.toLowerCase().charAt(word1.length()-1)
                + ""+word2.toUpperCase().charAt(word2.length()-2)+"" +word2.toLowerCase().charAt(word2.length()-1));
    }




}
