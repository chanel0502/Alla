package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main(String[] args){
        /*
        1.declare variable (means create variable)
        2.assign value to variable (put value inside variable)
        3.reassign value to variable(put new value to the same variable)

        VALUE ASSIGNMENT:
        byte myByte = 3;(declare variable and assign value)

        short age;(declaring variable)
        age = 40;(assigning value to variable)

         */
        byte myByte;
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);//10

        myByte = 20;
        System.out.println(myByte);//20

        _another_byte = 100;
        System.out.println(_another_byte);

        //===================================================================


        short firstShort = 45;
        short secondShort = 120;
        short thirdShort = 333;
        short forthShort = 76;
        short fifthShort = 999;


        firstShort = 50;
        System.out.println(firstShort);

        secondShort = 25;
        System.out.println(secondShort);

        thirdShort = 56;
        thirdShort = 22665;
        System.out.println(thirdShort);

        forthShort = 25;
        forthShort = 6786;
        System.out.println(forthShort);

        fifthShort = 199;
        fifthShort = -67;
        fifthShort = -1297;
        System.out.println(fifthShort);


        //======================================================

        int phone = 6703;
        int appleComputer = -33433727;
        int codewiseAcademy = 75848;
        int myBrain = 84493;
        int soul = 44;
        int paradise = 788890909;
        int heart = 30000000;
        int love = -565383;
        int apple = 67670000;
        int screan = 672222;


        phone = -5444;
        System.out.println(phone);

        appleComputer = 7899;
        appleComputer = -78733;
        System.out.println(appleComputer);

        codewiseAcademy = 10000000;
        System.out.println(codewiseAcademy);

        myBrain = -23233737;
        System.out.println(myBrain);

        soul = myBrain;
        System.out.println(soul);

        paradise = 67;
        System.out.println(paradise);

        heart = 250000;
        System.out.println(heart);

        love = paradise;
        System.out.println(love);

        apple = heart;
        System.out.println(apple);

        screan = 788888;
        screan = love;
        System.out.println(screan);

        //===========================================================


        long lonMunber1 = 1;
        lonMunber1 = 2000;

        long longNumber2 = -2147483649L;
        long longNumber3 = 2147483647L;

        longNumber2 = paradise;
        System.out.println(longNumber2);

        byte byteNumber = 10;
        short shortNumber = 2;
        int intNumber = 40;
        long longNumber = 30;

        longNumber = byteNumber;
        longNumber = shortNumber;
        intNumber = shortNumber;
        intNumber = byteNumber;

        //shortNumber = intNumber; NOT WORK

        //CASTING - is used to store larger variable values into smaller variable value
        intNumber = (int) longNumber;
        byteNumber = (byte) intNumber;
        shortNumber = (byte)longNumber;

        System.out.println(shortNumber);

        intNumber = 100;
        byteNumber = (byte) intNumber;
        System.out.println(byteNumber);













    }
}
