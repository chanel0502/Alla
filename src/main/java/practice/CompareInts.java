package practice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter");

        int a = user.nextInt();
        System.out.println("Enter 1st number");
        int b = user.nextInt();
        System.out.println("Enter 2nd number");
        int c = user.nextInt();
        System.out.println("Enter 3rd number");

        if (a > b && b < c){
            System.out.println("1st your integer is larger");
        }else if ( a < b  && b > c){
            System.out.println(" 2nd is larger");

        }else if( c > b && c > a){
            System.out.println( "3rd  is larger");
        }else
            System.out.println();
    }
}
