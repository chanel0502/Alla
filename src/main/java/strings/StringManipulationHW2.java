package strings;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        //1.
        String string = "Hello, my name is Alla!";
        System.out.println(string.endsWith("!"));

        //2.
        String one = string.substring(0,1);
        System.out.println(one);

        //3.
        string = string.replace("my","your");
        System.out.println(string);

        //4.
        System.out.println(string.trim().substring(7,19));

        //5.
        int lastCharacter = string.indexOf("!");
        System.out.println(lastCharacter);

        //6.
        System.out.println(string.startsWith("H"));

        //7.
        System.out.println(string.replace('H','K'));

        //8.
         char a = string.charAt(23);
        System.out.println(a);


        //9.
        string = new String("Hello, my name is Alla!");
        System.out.println(string.replace(" ",""));

        //10.
        System.out.println(string.toUpperCase());





        













    }
}
