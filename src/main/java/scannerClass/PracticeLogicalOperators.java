package scannerClass;

import java.util.Scanner;

public class PracticeLogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boolean: true/false");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter second boolean: true/false");
        boolean b = scanner.nextBoolean();

        if(a ==  !b   ){
            System.out.println("A is true and B is false");
        }if(!a == b){
            System.out.println("A is false and B is true");
        }
         if (a && b){
            System.out.println("Both A and B are true");
        }
        if (a  || b ){
            System.out.println("Either A and B are false");
        }
        if(!a  && !b){
            System.out.println("Both A and B are false");
        }

        //==============================================================


    }
}
