package strings;

public class StringCharAt {
    public static void main(String[] args) {

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println(c);

        char cc = welcomeSign.charAt(2);
        System.out.println(cc);
        char one = welcomeSign.charAt(0);
        System.out.println(one);

        /*

       print the last letter using charAt and length methods
         */
        System.out.println(welcomeSign.charAt(welcomeSign.length() -1));




    }
}
