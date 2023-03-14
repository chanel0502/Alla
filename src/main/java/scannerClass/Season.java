package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner season = new Scanner(System.in);
        System.out.println("Enter month: ");
         String month = season.next();

         if (month.equalsIgnoreCase("january") ||
                 month.equalsIgnoreCase("february") ||
                 month.equalsIgnoreCase("december")){
             System.out.println("Winter");
        }
         else if (month.equalsIgnoreCase("march") ||
                 month.equalsIgnoreCase("april") ||
                 month.equalsIgnoreCase("May")) {
             System.out.println("Spring");
         }
         else if(month.equalsIgnoreCase("march") ||
                     month.equalsIgnoreCase("april") ||
                     month.equalsIgnoreCase("may")){
                 System.out.println("Spring");
             }

         else if (month.equalsIgnoreCase("june") ||
                 month.equalsIgnoreCase("july") ||
                 month.equalsIgnoreCase("august")){

            System.out.println("Summer");
         }else if (month.equalsIgnoreCase("september") ||
                 month.equalsIgnoreCase("october") ||
                 month.equalsIgnoreCase("november")){
             System.out.println("Autumn");
         }
         else
             System.out.println("Invalid");

;
    }
}
