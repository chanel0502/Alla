package strings;

public class IntroToStrings {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName);
        System.out.println(lastName);

       firstName = "Mike";
       lastName = "Golt";
       System.out.println(lastName);

       //==================================================================

        String myName = "Alla";
        System.out.println(myName);

        String myMiddleName = "Allochka";
        System.out.println(myMiddleName);

        String myLastName = "Derevianko";
        System.out.println(myLastName);

        int age = 29;
        System.out.println(age);

        String address = "1522NRiverW";
        System.out.println(address);

        String mobile = "9419619300";
        System.out.println(mobile);

        String friendsName = "Rozolina";
        System.out.println(friendsName);

        String city = "Chicago";
        System.out.println(city);

        String myName1 = "Alla";
        String myLastName1 = "Derevianko";
        System.out.println(myName1 + " " + myLastName1);

        byte age1 =29;
        System.out.println("My name is " + myName1);
        System.out.println("I am "+ age1 + " years old");

        String address1 = "1522 N River W Ct,Apt.3B,Mount Prospect";
        System.out.println("My address is " + address1);

        String fruit1 = "aplle";
        String fruit2 = new String("banana");
        System.out.println(fruit2);

        String city1 = "London";
        System.out.println(city1);
        String city2 = new String("New York");
        System.out.println(city2);

        city1.length();
        System.out.println(city1.length());//6 returns the number of chars in String
        System.out.println(city2.length());

        String name1 = "Antananarivo";
        System.out.println("The length of Antananarivo is: "+ name1.length()) ;




        //==============================================================
          String shcool = "Codewise";
          shcool  ="Codewise Academy";

          /*
          equals () method compares values of 2 Strings
           */
          String fruit11 = "aplple";
          String fruit22 = "apple";
          String fruit33 = "Apple";

          boolean isSame = fruit11.equals(fruit22);
          System.out.println(isSame);
          isSame = fruit11.equals(fruit33);
          System.out.println(isSame);

          fruit11 = "banana";
          fruit22 = "otange";
          System.out.println("Is banana same as orange? " + fruit11.equals(fruit22));

          boolean isSame2 = !fruit11.equals(fruit22);//not equals
          System.out.println(isSame2);


          int cucumber  = 5;
          int tomato = 10;
          int empty = cucumber;
          cucumber = tomato;
          tomato = empty;

          System.out.println("cucumber: " + cucumber);
          System.out.println("tomato:" + tomato);

          String state1 = "California";
          String state2 ="Illinois";
          String state3 = "Florida";
          String state4 = "ILlinois";
          String state5 = "florida";

          boolean isTrue = !state1.equals(state2) ;
          System.out.println(isTrue);

          boolean isS =state2.equalsIgnoreCase(state4);
         System.out.println(isS);

         boolean state = state3.equals(state5);
        System.out.println(state);

        boolean oJ = state5.equalsIgnoreCase(state1);
        System.out.println(oJ);

        boolean hell = !state4.equals(state3);
        System.out.println(hell);




















    }
}
