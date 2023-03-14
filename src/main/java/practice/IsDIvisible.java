package practice;

import java.util.Scanner;

public class IsDIvisible {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter number");
        int number  = user.nextInt();

        int num1 = 10;
        int num2 = 5;
         if(num1 % num1 == 0){
             System.out.println("Divisible!");
         }else
            System.out.println("Not Divisible!");

    }
}
