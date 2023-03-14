package practice;

import java.util.Scanner;

public class AscendingIntClass {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter numbers");

        int a = user.nextInt();
        System.out.println("Enter 1st ");
        int b = user.nextInt();
        System.out.println("Enter 2nd");
        int c = user.nextInt();
        System.out.println("Enter 2rd");

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Descending order" + a + "," + b + "," + c);
                System.out.println("Ascending order" + c + "," + b + "," + a);
            } else {
                System.out.println("Descending order" + a + "," + c + "," + b);
                System.out.println("Ascending order" + b + "," + c + "," + a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Descending order" + c + "," + a + "," + b);
                System.out.println("Ascending order" + b + "," + a + "," + c);
            } else {
                System.out.println("Descending order" + b + "," + a + "," + c);
                System.out.println("Ascending order" + c + "," + a + "," + b);
            }
        } else {
            if (b > a) {
                System.out.println("Descending order" + c + "," + a + "," + b);
                System.out.println("Ascending order" + b + "," + a + "," + c);
            } else {
                System.out.println("Descending order" + a + "," + b + "," + c);
                System.out.println("Ascending order" + c + "," + b + "," + a);
            }


        }

    }
}