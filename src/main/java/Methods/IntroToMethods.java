package Methods;

public class IntroToMethods {


    int getPerimeterOfTriangle(int a, int b, int c){
        return a + b + c;
    }

     static int getLengthOfString( String str){
        return  str.length();
    }

    public static void main(String[] args) {
        IntroToMethods intro = new IntroToMethods();
        System.out.println(intro.getPerimeterOfTriangle(5,5,3));

        int length = getLengthOfString("Hello");
        System.out.println(length);
    }


}
