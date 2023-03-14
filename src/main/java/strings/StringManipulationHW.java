package strings;

public class StringManipulationHW {
    public static void main(String[] args) {
        //task1
        String str1 ="Hello,Universe!";
        char ch = 'o';
        int isContains = str1.indexOf(ch);
        System.out.println(str1.indexOf(str1+isContains+ch));

        //task2
        String str2 = "Hello,World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(start,end));

        //task3
        String str3 = "Good morning World";
        char w = str3.charAt(13);
        System.out.println(w);

        //task4
        String str4 = "       I love coding    ";
        str4 = str4.trim();
        System.out.println(str4);

        //task5
        String str5 = "Learn as if you will live forever, live like you will die tomorrow ";
        System.out.println(str5.replace('o',' ' ));






    }
}
