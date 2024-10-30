package ch3.exercises;

public class Exercise3_4 {
  public static void main (String[] args) {
    int currentCapacity = 399;
    int maxCapacity = 400;

    boolean isReached = currentCapacity >= maxCapacity;

    System.out.println("Is the maximum capacity reached: " + (isReached ? true : false));
  }
}
