package ifElse;

public class HomeworkIfElse {
    public static void main(String[] args) {
        //task1
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;

        if (num1 == num2){
            System.out.println("Equal");
        }else if(num1 == num3){
            System.out.println("Two of the numbers are equal");
        }else {
            System.out.println("None of the numbers are equal");
        }
        //task2
        int num = 9;
        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("Multiple of 3 or 5");
        }else {
            System.out.println("Not a multiple of 3 or 5");
        };
        //task3
        int numOne = 4;
        int numTwo = 3;

        if((numOne + numTwo) % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        //task 4
        int num5 = 7;
        if (num5 % 1 == 0 && num5 % num5 == 0){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }


    }
}
