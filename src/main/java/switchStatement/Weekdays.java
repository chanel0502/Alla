package switchStatement;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {

        int day = 5;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
        }
        //====================================
        char letter = 'A';
        switch (letter ){
        case 'A','E','I','O','U':
            System.out.println("Vowels");
            break;
            default:
                System.out.println("Consonant");
        }

//===================================================================

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a grade A,B,C,D,F");
        String grade = user.next();
        switch (grade){
            case "A":
                System.out.println("good job");
                break;
            case "B":
                System.out.println("good");
            case "C":
                System.out.println("perfect");
                break;
            case"D":
                System.out.println("amazing");
                break;
            case "F":
                System.out.println("incredible");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
