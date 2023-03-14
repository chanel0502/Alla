package objects;

public class Bank {
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount();
        BankAccount client2 = new BankAccount();
        BankAccount client3 = new BankAccount();

        client1.setAccountNumber("34567249");
        client2.setAccountNumber("463789325");


        client1.setAccountHolderName("John Travolta");
        client2.setAccountHolderName("Bruce Lee");

        client1.deposit(1900);
        client2.deposit(100);

        client1.withdraw(200);
        client1.withdraw(5000);
        client1.withdraw(1000);

        System.out.println(client1.getBalance());

        client1.deposit(10000);
        client1.printInfo();

        client1.withdraw(3000);

        client2.printInfo();
        client2.withdraw(100);
        System.out.println("Bruce's balance " + client2.getBalance());

    }
}
