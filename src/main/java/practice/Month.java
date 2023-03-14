package practice;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter month 1-12");

        int month = user.nextInt();
        System.out.println();

        if(month==1 || month==3 || month==5 ||month== 7 || month== 8 || month == 10 || month==12){
            System.out.println("31 days");
        }
         else  if (month == 2){
            System.out.println("28 days");
        }
        else if (month == 4 || month== 6 || month== 9 || month ==11){
             System.out.println("30 days");
         }
         else
             System.out.println("Invalid month");
    }
}
