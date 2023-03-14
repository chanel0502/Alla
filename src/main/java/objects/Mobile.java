package objects;

public class Mobile {

    String model;
    String price;
    String memory;


    public void ring(){
        System.out.println("It is a new " + model + " phone and it is cost : " + price+ ".");
    }
    public void turnOn(){
        System.out.println("The phone has " + memory + " . You can turn on it,when it charge enough.");
    }
    public void turnOf(){
        System.out.println("If the " + model + " is has no power, it will turn off");
    }

    public static void main(String[] args) {

        Mobile phone1 = new Mobile();
        phone1.model = "Samsung";
        phone1.memory = "64 GB";
        phone1.price = "1000 $";


        Mobile phone2 = new Mobile();
        phone2.model = "Iphone";
        phone2.memory = "128 GB";
        phone2.price = "1200 $";


        phone1.ring();
        phone1.turnOn();
        phone2.ring();
        phone2.turnOf();
    }
}
