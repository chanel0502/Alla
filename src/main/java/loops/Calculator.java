package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Enter one number");
            int num1 = user.nextInt();

            System.out.println("Enter arithmetic operator +, -, *, /, %");
            String arithmeticOperator = user.next();

            System.out.println("Enter second number");
            int num2 = user.nextInt();

            if(arithmeticOperator.equals("+")){
                System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
            }else if (arithmeticOperator.equals("-")){
                System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
            }else if(arithmeticOperator.equals("*")){
                System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
            }else if (arithmeticOperator.equals("/")){
                System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
            }else if( arithmeticOperator.equals("%")){
                System.out.println(num1 + "%" + num2 + " = " + (num1%num2));
            }else {
                System.out.println( "The operator is invalid");
            }
            System.out.println("Try again");
            yesNo =user.hasNextBoolean();

        }while (yesNo);
    }
}
