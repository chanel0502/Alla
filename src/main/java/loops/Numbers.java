package loops;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int sum = 0;
        int numOfNumbers = 0;
        int number;
        while (true) {
            System.out.println("Enter number a positive ( or negative to quit):");
            number = user.nextInt();

            if (number == 0) {
                continue;
            } else if (number < 0) {
                break;
            }
            sum += number;
            numOfNumbers++;
        }

        System.out.println("The sum of all numbers:" + sum);
        System.out.println("The average of all numbers:" + sum / numOfNumbers);

    }
}
