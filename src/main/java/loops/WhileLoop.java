package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }


        int a = 1;
        while (a <= 100){
            if( a % 2 == 0) {
            System.out.println(a);
            }
            a++;

        }

        int s = 1;
        while (s <= 10){
            System.out.println("Good morning everyone");
            s++;
        }


        int q = 100;
        while ( q >=1 ){
            if( q % 2 !=0){
                System.out.println(q);
            }q--;
        }


        int d = 1;
        while ( d <= 31){
            System.out.println(d + " january 2023" );
            d++;
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();


        boolean prime = true;
        int v = 2;

        while ( v < number) {
            if (number % v == 0) {
                prime = false;

            }
            v++;
        }
            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println(" Not prime");

            }

    }
}
