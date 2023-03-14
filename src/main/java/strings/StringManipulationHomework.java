package strings;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone,Let's do Java String exercises";
        char p = message.charAt(10);
        System.out.println(p);
        System.out.println("The character at position 10 is " + p);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(4));
        System.out.println(message.endsWith("s"));
        System.out.println("H".toLowerCase());
        System.out.println("s".toUpperCase());


    }
}
