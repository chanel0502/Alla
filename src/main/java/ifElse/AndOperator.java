package ifElse;

public class AndOperator {
    public static void main(String[] args) {

        if(2<3&&5<10){
            System.out.println("bye bye");
        }
        if(false&&true) {


            System.out.println("potato");
        }
        if(true&&false){
            System.out.println("do something");
        }
        if(true&&true){
            System.out.println("finally true");
        }

        //=====================================================

        String  actualusername ="sunshine123";
        String actualpassword = "moonligth456!true";
        String actualemail = "sunshine123@gmail.com";

        String enterUsername = "sunshine123";
        String enterPassword = "moonligth456!true";
        String enterEmail = "sunshine123@gmail.com";

        if (!actualusername.equals(enterEmail)){
            System.out.println("logged in");
        }
        if(!actualusername.equals(enterUsername)){
            System.out.println("Incorrect password");
        }else {
            System.out.println("Incorrect password");
        }
        if (!enterUsername.equals(enterPassword)){
            System.out.println("The userame doesnt exist");
        }

        if (actualusername.equals(enterUsername)&&enterEmail.equals(actualemail)&&enterPassword.equals(enterPassword)){
            System.out.println("recover username");
        }
        if(actualusername.equals(enterUsername)&&enterEmail.equals(actualemail)&&enterPassword.equals(actualpassword)){
            System.out.println("recover password");
        }
        if(enterUsername.equals(actualusername)){
            System.out.println("recover email");
        }
    }
}
