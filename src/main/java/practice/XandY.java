package practice;

import java.util.Scanner;

public class XandY {
    public static void main(String[] args) {

        Scanner user =  new Scanner(System.in);
        System.out.println("Enter first number");
        int x =user.nextInt();

        System.out.println("Enter second number");
        int y = user.nextInt();
        if (x > 0 && y > 0){
            System.out.println("Both x and y are positive");
        }else if (x == 0 || y == 0){
            System.out.println("Either x and y is zero");
        }else if (x < 0 && y < 0){
            System.out.println("Both x and y are negative");

        }else{
            System.out.println("One is positive,second is negative");
       }

    }
}
