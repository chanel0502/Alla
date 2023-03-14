package loops;

import java.util.Scanner;

public class HomeworkFactorial {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = user.nextInt();
        int factorial = 1;


        if (number > 0 ) {
            int a = 1;
            while (a <= number){
                factorial*=a;
                a++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);

        }else {
            System.out.println("Number must be positive");
        }



    }
}
