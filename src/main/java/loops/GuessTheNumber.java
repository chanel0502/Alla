package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {


        int randomNumber = new Random().nextInt(1, 100);
        Scanner user = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter number");
            num = user.nextInt();


            if(num < randomNumber){
                System.out.println("Too low,try again");
            }else if( num > randomNumber){
                System.out.println("Too high,try again");
            }else {
                System.out.println("you guessed the right number");
                break;
            }
        }while ( num <= 100);
    }
}
