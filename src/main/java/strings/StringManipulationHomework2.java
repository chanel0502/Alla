package strings;

public class StringManipulationHomework2 {
    public static void main(String[] args) {
     //task1
        String a1 = "Hello world";
        System.out.println(a1.indexOf("world"));
     //task2
        char a2 = a1.charAt(0);
        System.out.println(a2);
     //task3
        String a3 = "HELLO";
        System.out.println(a3.toLowerCase());
     //task4
        String a4 = "hello";
        System.out.println(a4.toUpperCase());
     //task5
        System.out.println(a3.equals(a4));//false
     //task6
        String a5 = "the quick brown fox";
        System.out.println(a5.substring(0,1).toUpperCase()+a5.substring(1,3).toLowerCase()+" "+a5.substring(4,5).toUpperCase()+a5.substring(5,10).toLowerCase()+" "+a5.substring(10,11).toUpperCase()+a5.substring(11,16).toLowerCase()+" "+a5.substring(16,17).toUpperCase()+a5.substring(17).toLowerCase());
    //task7
        String a6 = "Hello";
        System.out.println(""+a6.charAt(4)+a6.charAt(3)+a6.charAt(2)+a6.charAt(1)+a6.charAt(0));
    //task8
       // Write a program that counts the number of vowels in the string "Hello World"
        // using the charAt and toLowerCase methods. You said we didnt do this

    //task9
        String h1 = "Hello";
        String h2 = "World";
        System.out.println(h1.concat(h2));
    //task10
        String g = "hello";
        String k = "HELLO";
        System.out.println(g.equalsIgnoreCase(k));
     //task11
          String p = "Hello World";
        System.out.println(p.length());
     //task12
        String b = "Hello";
        System.out.println(b.charAt(2));
    //task13
        String n = "Hello world";
        System.out.println(n.indexOf("l"));
     //task14
        String j = "hello";
        String y = "hello";
        System.out.println(j.equals(y));
        System.out.println(j==y);
     //task15
        String v = "hello";
        String  q = "HELLO";
        System.out.println(v.equals(q));
        System.out.println(v==q);
     //task16
        String f = "HELLO WORLD";
        System.out.println(f.toLowerCase());
      //task17
        String d = "hello world";
        System.out.println(d.toUpperCase());
      //task18
        String r = "Hello World";
        System.out.println(r.replace('l','r'));
      //task19
        String a10 = "the quick brown fox";
        System.out.println(a5.substring(0,1).toUpperCase()+a10.substring(1,3).toLowerCase()+" "+a10.substring(4,5).toUpperCase()+a10.substring(5,10).toLowerCase()+" "+a10.substring(10,11).toUpperCase()+a10.substring(11,16).toLowerCase()+" "+a10.substring(16,17).toUpperCase()+a10.substring(17).toLowerCase());













    }
}
