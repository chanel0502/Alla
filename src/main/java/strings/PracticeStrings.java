package strings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length());//returns number of char
        System.out.println(singerName.endsWith("on"));
        System.out.println(singerName.endsWith("ON"));
        System.out.println(singerName.startsWith("Misha"));
        System.out.println(singerName.startsWith("michael"));
        System.out.println(!singerName.isEmpty());
        System.out.println(singerName.toLowerCase());
        System.out.println(singerName);

        singerName = singerName.toUpperCase();
        System.out.println(singerName);

        System.out.println(" " + singerName.charAt(0)+singerName.charAt(3));
        System.out.println(singerName.charAt(8));
        System.out.println(singerName.indexOf("C"));
        System.out.println(singerName.indexOf("C",3));
        System.out.println(singerName.indexOf("W"));//returns -1


        String singerName2 = "Jastin Bieber";
        boolean areTheySame = singerName2.equals(singerName);
        System.out.println(areTheySame);
        System.out.println(!singerName.equals(singerName2));

        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));
        System.out.println(singerName==singerName2);

//=================================================================

        String str = "Hello Codewise";
        String str2 = new String("Hello world");


        String name = "James";




    }
}
