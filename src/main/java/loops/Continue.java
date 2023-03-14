package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10;i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }


        for (int a = 1; a <= 100; a++){
            if ( a % 2 == 0 ){
                continue;
            }
            System.out.println(a);
        }

        for( int b = 1; b <= 10; b++){
            if( b % 3 == 0){
                continue;
            }
            System.out.println(b);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter negative and positive number");
        int negative = scanner.nextInt();
        int positive = scanner.nextInt();

        for ( int k = negative; k <= positive; k++){
            if( k < 0 && k % 2 == 0){
                continue;

            }else if ( k > 0 && k % 2 != 0){
                continue;
            }
            System.out.println(k);


        }




    }
}
