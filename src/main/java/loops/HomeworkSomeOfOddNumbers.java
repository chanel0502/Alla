package loops;

import java.util.Scanner;

public class HomeworkSomeOfOddNumbers {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =user.nextInt();
        int sum = 0;

        if(number > 0){
            int i = 1;
        while (i <= number){
            if( i % 2 != 0){
                sum+=i;
        }       i++;
        }
            System.out.println("Sum of odd numbers up to " +number + " is " + sum);
        }else {
            System.out.println("Number must be positive");
        }
    }
}
