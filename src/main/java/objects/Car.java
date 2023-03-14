package objects;

public class Car {

    String  model;
    long year;
    long price;
    String color;

    public void drive(){
        System.out.println("The model of car is:" + model );
        System.out.println("The year of car is: " + year);
        System.out.println("The prise of car is:" + price);
        System.out.println("The color of car is:" + color);
    }

    public void stop(){
        System.out.println("The price stop" + price );
    }
    public void playMusic(){
        System.out.println("In the " + model + " we can listen to music");
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Lexus";
        car1.price = 70000;
        car1.year = 2020;
        car1.color = "Grey";



        car1.drive();
        car1.stop();
        car1.playMusic();
    }
}
