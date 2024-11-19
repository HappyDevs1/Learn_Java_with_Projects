package ch7.exercises;

public class Exercise7_4 {
  public static void main (String[] args) {
    checkPark(4);
  }

  public static void checkPark (int time) {
    if (time >= 7 && time <= 17) {
      System.out.println("The park is opened, you cannot make any repair");
    } else {
      System.out.println("The park is closed, you can repairing any damages");
    }
  }
}
