package objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String habitat;


    public void eat(){
        System.out.println("The type of animal is: " + type +
                ".The age of " + type+ " is " + age +" years old " + " and it can eating " + isCarnivore);
    }

    public void sleep(){
        System.out.println(type + " is sleeping in " + habitat);
    }
    public void play(){
        System.out.println(type + " playing in " + habitat);
    }
}
