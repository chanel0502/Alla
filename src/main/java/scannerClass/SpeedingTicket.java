package scannerClass;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {

        Scanner driver = new Scanner(System.in);
        System.out.println("Enter speed");

        int speed = driver.nextInt();
        System.out.println("Birthday? Enter: true/false");

        boolean isBirthday = driver.nextBoolean();

        if (!isBirthday) {
            if (speed <= 60) {
                System.out.println("no ticket");
            } else if (speed > 60 && speed <= 80) {
                System.out.println("small ticket");
            } else if (speed > 80 && speed <= 100) {
                System.out.println("medium ticket");
            } else {
                System.out.println("large ticket");
            }
        } else {
            if (speed <= 80) {
                System.out.println("no ticket");
            } else if (speed >= 80 && speed <= 100) {
                System.out.println("small ticket");
            } else {
                System.out.println("medium ticket");
            }
        }



    }
}
