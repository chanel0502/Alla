package Methods;

import scannerClass.Calculator;

public class CalculatorMethod {


    public int sum(int x, int y) {

        return x + y;
    }

    public int difference(int x, int y) {

        return x - y;
    }

    public int multiply(int x, int y) {

        return x * y;
    }

    public double divide(int x, int y) {
        if( y != 0){
            return (double) x / y;
        }else{
            return 0;
        }

    }

    public int modulus(int x, int y) {
        return x % y;
    }


    public static void main(String[] args) {
        CalculatorMethod calculator = new CalculatorMethod();

        int sum = calculator.sum(2, 3); // sum = 5
        int difference = calculator.difference(5, 2); // difference = 3
        int product = calculator.multiply(4, 6); // product = 24
        double quotient = calculator.divide(10, 3); // quotient = 3.3333333333333335
        int remainder = calculator.modulus(10, 3);//reminder = 1
    }

}
