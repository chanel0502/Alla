package practice;

import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter three booleans");
        boolean a = user.nextBoolean();
        boolean b = user.nextBoolean();
        boolean c = user.nextBoolean();

        if(a  && b && c){
            System.out.println("all true");
        } else if ( a &&b || b && c ||  c && a ){
            System.out.println("at least two are true");
        }else
            System.out.println("at least are two not true");

    }
}
