package loops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {


        Scanner user = new Scanner(System.in);
        int num ;
        do {
            System.out.println("Enter even number");
            num = user.nextInt();

        }while (num % 2 != 0);
    }
}
