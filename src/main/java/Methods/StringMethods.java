package Methods;

public class StringMethods {


    static  boolean compareStrings(String str1,String str2){
       if(str1.equals(str2)){
           return  true;
       }
       return false;
    }

    static String concatenateString(String name,String name2){
        return (name + " " + name2).toUpperCase();
    }


    static  int getLength(String one,String two){
        return  (one + two).length();
    }



     public static boolean isEven( int one){
        if (one % 2 == 0){
            return true;
        }return false;
     }


     public static boolean isDivisible( int num){
        return num % 10 == 0;
     }

     public static void calculator(int one) {
         for (int i = 1; i <= 10; i++) {
             System.out.println(one + "*" + i + "=" + (one * i));
         }
     }

     public static int printLargerOne(int a, int b){
        if ( a > b){
            System.out.println(a);
            return a;
        }
         System.out.println(b);
        return b;
    }



    public static int average(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }


    public static int sumOfNumbers( int num){
        int sum = 0;
        for( int i = 1; i <= num; i++){
            sum += i;

        }return sum;
    }












    public static void main(String[] args) {
        boolean isSame = compareStrings("hello","hello");
        System.out.println(isSame);

        String concat = concatenateString("Hello", "Codewise");
        System.out.println(concat);


        calculator(5);

        System.out.println(average(5,7,3,5));

        System.out.println(sumOfNumbers(5));
    }






}
