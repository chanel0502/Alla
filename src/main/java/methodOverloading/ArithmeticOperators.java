package methodOverloading;

public class ArithmeticOperators {

    public int sumOfNumbers(int a,int b){
        return a + b;
    }
    public int sumOfNumbers(int a,int b,int c){
        return  a + b + c;
    }


    public int averageOfNumbers( int a, int b, int c, int d){
        return (a + b + c + d) /4;
    }

    public  int averageOfNumbers( int a, int b, int c,int d ,int f, int h){
        return (a + b + c + d + f + h)/6 ;
    }


    public double getAreaOfTriangle(int base,int height){
       return 0.5 * base * height;
    }
    public double getAreaOfTriangle(int a, int b, int c){
        int semiPerimeter = (a + b + c) /2;
        return  Math.sqrt(semiPerimeter *(semiPerimeter - a) * (semiPerimeter - b) *(semiPerimeter - c));

    }


    public double getAreaOfTriangle(double base,double height){
        return 0.5 * base * height;
    }
    public double getAreaOfTriangle(double a, double b, double c){
       double semiPerimeter = (a + b + c) /2;
        return  Math.sqrt(semiPerimeter *(semiPerimeter - a) * (semiPerimeter - b) *(semiPerimeter - c));

    }
}
