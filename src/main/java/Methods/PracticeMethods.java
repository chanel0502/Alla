package Methods;

public class PracticeMethods {

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public String toLowerCase(String word) {
        return word.toLowerCase();
    }

    public double dividesOneByAnother(int a, int b) {
        return (double) a / b;
    }


    public static boolean palindrome(String c) {
        String reverse = "";
        for (int i = c.length() - 1; i >= 0; i--) {
            reverse += c.charAt(i);
        }
        return c.equals(reverse);

    }

    public double multipliedBy100(double a) {
        return a * 100;
    }

    public static boolean consonant(char d) {
        if (d != 'a' && d != 'o' && d != 'e' && d != 'u' && d != 'i') {
            return true;
        }
        return false;
    }

    public boolean differenceBetween(int z, int y) {
        boolean result = false;
        if (z - y == 5) {
            return true;
        }
        return result;
    }

    public boolean addressFormat(String q){
       if( q.contains("@") && q.contains(".")) {
           return true;
       }return false;
    }

      public boolean primeNumber(int a){
        boolean result = true;
            if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0){
                result = false;
            }
        return result;
      }

      public static boolean sameParity(int i, int v){
        if( i % 2==0 && i % 2 != 0 || v % 2 == 0 && v % 2!= 0){
            return true;
        }return false;
      }






    public static void main(String[] args) {
        PracticeMethods practiceMethods1 = new PracticeMethods();
        System.out.println(practiceMethods1.toLowerCase("HELLO WORLD"));
        System.out.println(palindrome("civic"));
        System.out.println(consonant('o'));
        System.out.println(practiceMethods1.differenceBetween(-10,-5));
        System.out.println(practiceMethods1.primeNumber(3));
    }
}