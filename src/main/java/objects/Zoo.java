package objects;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = "elephant";
        animal1.isMammal = true;
        animal1.isCarnivore = true;
        animal1.age = 10;
        animal1.habitat = "Jungle";



        Animal animal2 = new Animal();
        animal2.type = "dog";
        animal2.isMammal = true;
        animal2.isCarnivore = true;
        animal2.age = 15;
        animal2.habitat = "house";


        animal1.eat();
        animal2.eat();
        animal1.play();
        animal2.play();
    }
}
