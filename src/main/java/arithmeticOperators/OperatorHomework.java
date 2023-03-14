
package arithmeticOperators;

public class OperatorHomework {
    public static void main(String[] args) {


        int a = 100;
        int b = 200;
        int sum = a+b;
        System.out.println(sum);


        int q = 5;
        int w = 9;
        int e = 10;
        int sum1 = q+w+e;
        System.out.println(sum1);


        byte m = 1;
        byte l = 2;
        byte p = 3;

        System.out.println(m + "+" + l + "=" + (m + l)); //1+2=3
        System.out.println(p + "-" + m + "=" + (p - m)); //3-1=2
        System.out.println(l + "*" + b + "=" + (l * l)); //2*2=4
        System.out.println((p + m) + "/" + l + "=" + l); //4/2=2
        System.out.println(l + "+" + (l * l * l) + "=" + ((l + p) * l)); //2+8=10
        System.out.println(((l + p) * l) + "%" + ((l * p) + m) + "=" + l); //10%7=3



        int length = 15;
        int width = 9;
        int area = length * width;
        int perimetr = 2*(length+width);
        System.out.println(area); //135 area
        System.out.println(perimetr); //48  perimeter



        int t = 8;
        t += 2345;
        t /= 3;
        t %= 5;
        t *= 5;
        System.out.println(t);


        byte door = 20;
        door += 5;
        System.out.println(door); //25
        door -= 5;
        System.out.println(door); //20
        door *= 5;
        System.out.println(door); //100



        boolean num1 = 23 == 45;
        System.out.println(num1); //false



        boolean apple = -10 == 10;
        System.out.println(apple); //false



    }
}