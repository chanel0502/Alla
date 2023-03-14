package switchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int number = 3;

        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }

        //==============================================================================

        String digit = "three";
        switch (digit){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case"three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("invalid number");

        }

        String numb = "three";

        if (numb == "one") {
            System.out.println(1);
        }
        else if (numb == "two"){
            System.out.println(2);
        }
        else if(numb == "three"){
            System.out.println(3);
        }
        else if (numb == "four"){
            System.out.println(4);
        }
        else if (numb == "five"){
            System.out.println(5);
        }else
            System.out.println("Invalid");



    }
}
