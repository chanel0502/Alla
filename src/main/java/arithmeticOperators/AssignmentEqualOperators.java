package arithmeticOperators;

public class AssignmentEqualOperators {
    public static void main(String[] args) {

        /*
        = assignment operator ( when you give value to variable)
        == equal equal operator (compares two variables if they are equal ot not)
        != not equal operator (compares if two variable are not equal)
         */

        int number1 = 10;//assignment
        int number2 = 8;
        System.out.println(number1 == number2);
        System.out.println(100==100);

        boolean isEqual = 100==101;
        System.out.println(isEqual);

        boolean isEven;
        isEven = 80 % 2== 0;
        isEven = 143376392769L % 2==0;
        System.out.println(isEven);


       System.out.println(30%7!=0);





    }
}
