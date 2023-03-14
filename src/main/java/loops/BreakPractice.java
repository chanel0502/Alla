package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int number  = user.nextInt();
        int number2 = user.nextInt();


        int sum = number + number2;
        for (int a = 1; a <= sum; a++){
            System.out.println(a);
            if( a == 45){
                break;
            }


        }

    }
}
