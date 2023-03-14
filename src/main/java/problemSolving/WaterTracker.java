package problemSolving;

public class WaterTracker {

    int consumeWater;
    int dailyWaterGoal= 2000;


     public void addWater(int milliliters) {
         if (milliliters > 0) {
             consumeWater += milliliters;
         }else{
             System.out.println("Consumed amount can be only positive ");
         }
     }

      public int getWaterIntake(){
         return consumeWater;
      }


      public String getStatus(){
         if(consumeWater  >= dailyWaterGoal){
             return "You are hydrated!";
         }else{
             return "You need to drink more water";
         }
      }

      public void  reset(){
         consumeWater = 0;
      }

      public void setWaterGoal(int waterGoalAmount){
         if(waterGoalAmount > 2000){
             System.out.println("You set a new daily water consumption limit ");
         dailyWaterGoal = waterGoalAmount;
         }
         else {
             System.out.println("The amount of water should be more than 2000 ml");
         }
      }




    public static void main(String[] args) {
        WaterTracker waterTracker1 = new WaterTracker();
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getWaterIntake());
        waterTracker1.addWater(1000);
        System.out.println(waterTracker1.getWaterIntake());
        System.out.println(waterTracker1.getStatus());
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getStatus());
    }

}
