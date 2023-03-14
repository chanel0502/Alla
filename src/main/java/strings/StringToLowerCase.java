package strings;

public class StringToLowerCase {
    public static void main(String[] args) {

        String word = "Hello EverYONE! HOW ARE you doinG";
        System.out.println(word);
        word = word.toLowerCase();//converts to lower case
        System.out.println(word);


        String word2 = "hello guys,I'm good. And you?";
        System.out.println(word2);
        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";
        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equals(word4.toLowerCase()));
        System.out.println(word3.equalsIgnoreCase(word4));


        /*
        compare word and word2 ==> true
        BUT DO NOT USE
         */
        System.out.println(word.equalsIgnoreCase(word2));
        System.out.println(word.equals(word2));


    }

}
