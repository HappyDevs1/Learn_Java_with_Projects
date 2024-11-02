package ch5.exercises;

public class Exercise5_3 {
  public static void main (String[] args) {
    int countdown = 15;
    while (countdown > 0) {
      System.out.println("The park is opening in " + countdown-- + " seconds.");
    }
    System.out.println("The park is finally open");
  }
}
