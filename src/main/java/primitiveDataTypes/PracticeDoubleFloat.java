package primitiveDataTypes;

public class PracticeDoubleFloat {
    public static void main(String [] args){

        /*
        float and double are variable that store decimal numbers
        double is larger than float
        double is the most precise variable
        Java thinks that all decimal numbers are double
        to make sure float is float put F/f in the end

         */

        double priceOdBread = 4.99;
        double priseOfApple = 3.99555444444444444444445555555;
        System.out.println(priseOfApple);

        priceOdBread = 344399976665.8783;
        System.out.println(priceOdBread);

        priceOdBread = 98.1;
        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545.64F;

        double double1 = 2343;

        float1 = (float) double1;
        double1 = float1;
        double1 = long1;
        double1 = 4.99;

        long1 = (long)double1;
        System.out.println(long1);









    }
}
