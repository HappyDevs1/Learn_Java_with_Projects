package ch7.exercises;

public class Exercise7_1 {
  public static void main (String[] args) {
    checkDino(150);
  }

  public static void checkDino (int age) {
    if (age < 100) {
      System.out.println("The dinosaur is still a hatchling");
    } else if (age < 200) {
      System.out.println("The dinosaur is a juvenile");
    } else if (age > 200) {
      System.out.println("The dinosaur is now an adult");
    }
  }
}
