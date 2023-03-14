package loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();

        int limit = 40;
        for ( int i = 0; i <= number; i++){
            if (i > 40) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("After loop");


       //================================================






    }
}
