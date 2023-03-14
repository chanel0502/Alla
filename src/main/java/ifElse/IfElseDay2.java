package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {

        int day = 3;
        if (day==1){
            System.out.println("Monday");
        }else if(day==2){
        System.out.println("Tuesday");
        }else if (day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if (day==5){
            System.out.println("Friday");
        }else if (day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }

        String dayOfWeek = "tuesday";
        if (dayOfWeek.equalsIgnoreCase("Monday")){
            System.out.println(1);
        }else if(dayOfWeek.equalsIgnoreCase("Tuesday")){
            System.out.println(2);
        }else if (dayOfWeek.equalsIgnoreCase("Wednesday")){
            System.out.println(3);
        }else if (dayOfWeek.equalsIgnoreCase("Thursday")){
            System.out.println(4);
        }else if (dayOfWeek.equalsIgnoreCase("Friday")){
            System.out.println(5);
        }else if (dayOfWeek.equalsIgnoreCase("Saturday")){
            System.out.println(6);
        }else if(dayOfWeek.equalsIgnoreCase("Sunday")){
            System.out.println(7);
        }

        byte time = 18;
        if (time >= 9 && time <= 17){
            System.out.println("WORK HOURS");
        }if(time >=7 && time<= 9 ||time >= 18 && time <= 19){
            System.out.println("COMMUTE HOURS");
        }if (time>= 6 && time <=8){
            System.out.println("BREAKFAST TIME");
        }if(time>= 12 && time<=13){
            System.out.println("LUNCH TIME");
        }if(time>=20 && time <=22){
            System.out.println("DINNER TIME");
        }if (time==22){
            System.out.println("LATE HOURS");
        }if (time>=0 && time<=6){
            System.out.println("SLEEP TIME");
        }else
            System.out.println("INVALID TIME,enter time between and 24");


    }
}
