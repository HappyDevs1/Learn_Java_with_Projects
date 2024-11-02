package ch5.projects;

public class DinoMealPlanner {
  public static void main (String[] args) {
    int time = 0;
    int TRexPortion = 100;
    int BrachiosaurusPortion = 250;

    for (int i = 0; i <= 23; i++) {
      if (time == 8 || time == 14 || time == 20) {
        System.out.println("The time is now " + time++ + ":00 feed the T-Rex " + "with the portion of " + TRexPortion + " kg.");
      } else if (time == 7 || time == 11 || time == 15 || time == 19) {
        System.out.println("The time is now " + time++ + ":00 feed the Brachiosaurus " + "with the portion of " + BrachiosaurusPortion + " kg.");
      } else {
        System.out.println("The time now is " + time++ + ":00");
      }
    }
  }
}
