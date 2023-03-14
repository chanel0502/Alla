package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");

        if (a==b){
            System.out.println("a is more than  b");
        }
        else{
            System.out.println("a is less than b");
        }
        System.out.println("I already compared a and b");


        int number1 = 10;
        int number2 = 50;
        if(number1/number2==2){
            System.out.println("YES,two!");
        }else{
            System.out.println("Not two!");
        }

        String elon = "Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not own Paypal");
        }


        boolean bool = 7>8;
        boolean cool = 8<7;
        if (bool==cool){
            System.out.println("Bool equal to Cool");
        }

        int n = 100/5;
        int j = 20;
        if (n>j){
            System.out.println("N more than j");
        }else{
            System.out.println("N less than J");
        }

        String its1 = "My name is Alla";
        if (its1.startsWith("My")){
            System.out.println("My name stars with My");
        }else {
            System.out.println("My name stars with Alla");
        }

        String name = "Codewise";
        if (name.equals(7)){
            System.out.println("codewise length is ");
        }else{
            System.out.println("length of codewise is ");
        }

        String pipe = "We came to scholl";
        if (pipe.endsWith("ll")){
            System.out.println("ends with ll");

        }








   }
}
