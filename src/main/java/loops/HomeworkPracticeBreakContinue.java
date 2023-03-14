package loops;

import java.util.Scanner;

public class HomeworkPracticeBreakContinue {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int number = user.nextInt();


        for (int i = 1; i < number; i++ ) {
            if (number >= 3){

            if (number % 3 == 0 && number % 5 != 0) {
                System.out.println(i);

            }
            } else if (number < 0) {
                System.out.println("Input must be positive");

            }else
             System.out.println("There ano integer less than " + number + "that are divisible ny 3 but not by 5");





        }





    }
}
