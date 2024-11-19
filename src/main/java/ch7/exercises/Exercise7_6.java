package ch7.exercises;

public class Exercise7_6 {
  public static void main (String[] args) {
    checkVisitors(100);
  }

  public static void checkVisitors (int num) {
    if (num > 400) {
      System.out.println("You can't enter now, the maximum capacity has been reached");
    } else {
      System.out.println("You are welcome to enter now");
    }
  }
}
