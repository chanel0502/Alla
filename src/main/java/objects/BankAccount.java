package objects;

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;
    double dailyWithdrawLimit = 5000;
    double dailyWithdrawedAmount;

    public void deposit(double amount){
        balance += amount;
        System.out.println("INFO:" +accountHolderName + "successfully deposed" + amount + "$" );
    }

    public  boolean withdraw(double amount){

        if(amount >= 0 && amount <= balance &&  dailyWithdrawedAmount + amount <= dailyWithdrawLimit){
            System.out.println("Transaction is approved. Withdrawing:" + amount + "$");
            balance -= amount;
            dailyWithdrawedAmount += amount;
            return true;

        }else if (amount > dailyWithdrawLimit || dailyWithdrawedAmount + amount > dailyWithdrawLimit ){
            System.out.println("The daily withdraw  limit should not exceed 5000");
            System.out.println("You  already withdrawed " + dailyWithdrawedAmount);
            return false;

        }if (amount > balance) {
            System.out.println("Insufficient founds");
            return false;

        }
            System.out.println("Something happened!Failed to withdraw.Please try again");
              return false;
        }

        public  void setAccountNumber(String accountNumber){
        boolean isValidAccountNumber = true;

        if (accountNumber.length() == 8){

         for (int i = 0; i < 8 ;i++){
             if(! Character.isDigit(accountNumber.charAt(i))){
                 System.out.println("WARNING: The account number must only contain digits");
                 isValidAccountNumber = false;
                 break;
              }
           }
        }else {
            System.out.println("WARNING: The length of account number must be 8");
            isValidAccountNumber = false;
        }
        if(isValidAccountNumber){
            System.out.println("SUCCESSFUL: account number is valid");
            this.accountNumber = accountNumber;
        }else {
            System.out.println("FAILURE: The provided account number is not valid");
        }
    }


    public String getAccountNumber(){
        System.out.println("Account number " + accountNumber);
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        boolean isValidAccountHolderName = true;
        if(accountHolderName.equals(null) || accountHolderName.isEmpty() ||accountHolderName.trim().length() == 0
                || accountHolderName.length() > 256){
            isValidAccountHolderName = false;
        }
        if (isValidAccountHolderName){
            System.out.println( "SUCCESS: Account holder name is valid");
            this.accountHolderName = accountHolderName;
        }else {
            System.out.println("FAILURE: Account holder name must not be empty or more than 256 letters");
        }
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }


    public double getBalance(){
        return balance;
    }

    public String printInfo(){
        String str = "Account holder's name:" + accountHolderName + "\n" +
                "Account number:" + accountNumber + "\n"+
                "Current balance:" + balance + "\n" +
                "Today withdrawed:" + dailyWithdrawedAmount + "$";
        return null;
    }

}
