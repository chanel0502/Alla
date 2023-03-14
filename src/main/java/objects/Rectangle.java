package objects;

public class Rectangle {

    int width;
    int height;


    public void calculateArea(){

        System.out.println("The area of rectangle is: " +  width * height);
    }
    public void calculatePerimeter(){

        System.out.println("The perimeter of rectangle is: " + (width + height) * 2);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 15;
        rectangle1.width = 10;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 23;
        rectangle2.width = 14;


        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();


    }
}
