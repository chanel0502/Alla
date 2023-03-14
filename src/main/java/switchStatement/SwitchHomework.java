package switchStatement;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter symbol");
        String symbol = user.next();



        switch (symbol){
            case "!":
                System.out.println("exclamation mark");
                break;
            case "?":
                System.out.println("question mark");
                break;
            case "%":
                System.out.println("modulus");
                break;
            case "#":
                System.out.println("hush");
                break;
            case "*":
                System.out.println("star");
                break;
            case "@":
                System.out.println("at");
                break;
            case "$":
                System.out.println("dollar sign");
                break;
            default:
                System.out.println("invalid symbol");

        }
    }
}
