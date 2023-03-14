package loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);


        int t = 1;
        do {
            if (t % 2 != 0){
                System.out.println(t);
            }
            t++;
        }while (t <= 100);
    }
}
