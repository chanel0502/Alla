package scannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int num = user.nextInt();
        if (num>=1 && num<=10){
            System.out.println("Valid input");
        }else
            System.out.println("Invalid input");


    }
}
