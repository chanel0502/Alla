package primitiveDataTypes;

public class VariableCastingHomework {
    public static void main(String[] args) {

        byte strawberry = 5;
        short peach = 8899;
        int potato = -344433;
        long apple = 337222220000093L;
        float cucumber = 33.33F;
        double blueberry = 5.55;


        peach = strawberry;
        System.out.println(peach);
        potato= strawberry;
        System.out.println(potato);
        apple = strawberry;
        System.out.println(apple);
        cucumber = strawberry;
        System.out.println(cucumber);
        blueberry = strawberry;
        System.out.println(blueberry);


        strawberry = (byte)peach;
        System.out.println(strawberry);
        potato = peach;
        System.out.println(peach);
        apple = peach;
        System.out.println(apple);
        cucumber = peach;
        System.out.println(cucumber);
        blueberry = peach;
        System.out.println(blueberry);


        strawberry = (byte) potato;
        System.out.println(strawberry);
        peach = (short) potato;
        System.out.println(peach);
        apple = potato;
        System.out.println(apple);
        cucumber = potato;
        System.out.println(cucumber);
        blueberry = potato;
        System.out.println(blueberry);


        strawberry = (byte) apple;
        System.out.println(strawberry);
        peach = (short) apple;
        System.out.println(peach);
        potato = (int) apple;
        System.out.println(potato);
        cucumber = apple;
        System.out.println(cucumber);
        blueberry = apple;
        System.out.println(blueberry);


        strawberry = (byte) cucumber;
        System.out.println(strawberry);
        peach = (short) cucumber;
        System.out.println(peach);
        potato = (int) cucumber;
        System.out.println(potato);
        apple = (long) cucumber;
        System.out.println(apple);
        blueberry = cucumber;
        System.out.println(blueberry);


        strawberry = (byte) blueberry;
        System.out.println(strawberry);
        peach = (short) blueberry;
        System.out.println(peach);
        potato = (int) blueberry;
        System.out.println(potato);
        apple = (long) blueberry;
        System.out.println(apple);
        cucumber = (float) blueberry;
        System.out.println(cucumber);


















    }
}
