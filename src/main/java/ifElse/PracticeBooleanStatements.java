package ifElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {

        boolean a = 5<10;
        System.out.println(a);
        boolean g = 30>40;
        System.out.println(g);
        boolean n = 3==3;



        String  str1 = "apple";
        boolean b = str1.startsWith("a");
        System.out.println(b);
        String  str2 = "universe";
        boolean k = str2.endsWith("e");
        System.out.println(k);
        String str3 = "orange";
        boolean l = str3.equals(k);
        System.out.println(l);
        String str4 = "iphone";
        boolean t = str4.equals(b);
        System.out.println(t);
        String str5 = "tomorrow";
        boolean d = str5.endsWith("t");
        System.out.println(d);
        String str6 = "today";
        boolean v = str6.length()==5;
        System.out.println(v);
        String str7 = "yesterday";
        boolean i = str7.contains("y");
        System.out.println(i);
        String str8 = "HELLO";
        boolean w = str8.toLowerCase().equals(str8);
        System.out.println(w);

    }
}
