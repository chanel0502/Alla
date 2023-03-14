package problemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter anything");
        String word = user.nextLine();


        if (word.isEmpty()){
            System.out.println("Empty");
            } else  {
            System.out.println("not empty");

        }



    }
}
