package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {

        String a = "Weather";

        if(a.contains("e")){
            System.out.println(a.indexOf("e"));
        }else
            System.out.println("The word does not contain the letter 'e'");


        //==============================================


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digits zipcode");

        int zipCode = scanner.nextInt();
        String zip  = zipCode+ "";

        if ((zip.length() == 5 && !zip.contains("9") && zip.charAt(0) != '0')){
            System.out.println("the zipcode is invalid");
        }else {
            System.out.println("the zipcode is valid");
        }

    }
}
