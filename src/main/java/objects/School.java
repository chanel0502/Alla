package objects;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Maria";
        student2.phone = "312445668";
        student2.email = "maria@yahoo.com";
        student2.age = 17;
        student2.major = "Accounting";



        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();
    }
}
