package loops;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int i =10; i >=1 ; i--){
            System.out.println("The value of x is: " + i);
        }

        for (int a = 10; a >= 0; a-=2){
            System.out.println("The value of y is: " + a);
        }

        for (int n = 1; n <=15; n+= 2){
            System.out.println("The value if num is:" + n);
        }
        int sum = 0;
        for (int d = 1; d <=10; d++){
            System.out.println("The value of d is: " + d);
            sum = sum + d;
        }
        System.out.println("The result is " + sum);



        int sum1 = 0;
        for (int w = 0 ; w <= 100; w += 2 ){
            System.out.println("The value of w is:" + w);
            sum1 = sum1 + w;

        }
        System.out.println("The sum is: " + sum1);


    }
}
