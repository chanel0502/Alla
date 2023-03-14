package loops;

public class NestedLoops {
    public static void main(String[] args) {

        /*
        nested loop = loop inside loop
         */

        for (int i = 1; i <= 15; i++){
            for (int a = 1; a <= 15; a++){
                System.out.print((i * a) + "\t");
            }
            System.out.println();
        }


        for (int q = 1; q <= 10; q++){
            for( int t = 1; t <= q; t++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        int row = 5;
        for (int w = 1; w <= 5; w++) {

            for (int f = row - w; f > 0; f--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= w; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
