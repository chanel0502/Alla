package loops;

import java.util.Scanner;

public class HomeworkForLoop {
    public static void main(String[] args) {

        // task 1
        for (int i = 1; i <= 50; i++){
            if( i % 5 == 0)
            System.out.println(i);
        }

        // task 2
        for (int a = 2; a <= 20; a += 2) {
            System.out.println(a);
        }
        // task 3

        for (int z = 10; z >= 1; z--){
            System.out.println(z);
        }
        // task4

        for (int w = 1; w <=5; w++){
            for( int y = 1; y <= 5; y++){
                System.out.print((w * y ) + "\t");
            }
            System.out.println();
        }
        //task 5

        for ( int b = 1; b < 20; b += 2){
            System.out.println(b);
        }

        //task 6

        int sum = 0;
        for (int n = 0;n <= 50; n += 2){
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("The sum of even numbers is " + sum);

        //task 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int sum1 = 0;

        for (int l = 1; l <= 10; l++) {
            sum1 = num1 + num2 + num3 + num4;
            System.out.println((num1 + " + " + num2 + " + " + num3 + " + " + num4) + " = " + sum1);
        }



        //task8

        for(int t = 5; t >= 1; t--){
            for (int o = 1; o <= t; o++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //task9

        for (int h = 1; h <= 4 ; h++){
            for (int m = 1; m <= h ; m++){
                System.out.print(h);
            }
            System.out.println();
        }





    }
}
