package ifElse;

public class IfElseHomework {
    public static void main(String[] args) {
        //1.
        int number = 40;
        if(number>20){
            System.out.println("positive");
        }else if (number==5){
            System.out.println(" negative");
        }
         else {
            System.out.println("zero");
        }

         //2.
         int year = 2019;
         if((year%4==0 && year%100!=0) || year%400==0){
             System.out.println("The  year is a leap");
         }else {
             System.out.println("The year is not a leap");
         }

         //3.
         int num1 = 3;
         int num2 = 123;
         if(num1<num2){
             System.out.println(num2 +" is larger " +num1);
         }else if(num1>num2){
             System.out.println(num1+ " is larger than "+ num2);
        }

         //4.
         double tempInFahrenheit = 77.3;
         if (tempInFahrenheit<=32){
             System.out.println(tempInFahrenheit + "below freezing");
         }else if(tempInFahrenheit>=212){
             System.out.println(tempInFahrenheit +" above boiling");
         }else{
             System.out.println("Between");
         }


         //5.
          byte month = 6;
          byte winter = 1;
          byte spring = 2;
          byte summer = 3;
          byte autumn = 4;

         if(month>=winter){
             System.out.println("winter stars in December");
        }if(month!=spring){
            System.out.println("spring stars in March");
        }if(month%summer==0){
            System.out.println("summer starts in June");
        }if(month%autumn==2){
            System.out.println("autumn starts in September");
        }




    }
}
