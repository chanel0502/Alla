package strings;

public class StringIndexOf {
    public static void main(String[] args) {

        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g');
        System.out.println(index);
        int four = ad.indexOf('t');
        System.out.println(four);

        index = ad.indexOf('o',7);
        System.out.println(index);
        index =ad.indexOf('o',ad.indexOf('o'));
        System.out.println(index);


    }
}
