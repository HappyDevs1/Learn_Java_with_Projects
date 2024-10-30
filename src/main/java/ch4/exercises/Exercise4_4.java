package ch4.exercises;
import java.util.Scanner;

public class Exercise4_4 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter current rating of the park to verify it's safety");
    double currentRating = sc.nextDouble();
    double safeRating = 4.0;
    String safetyMessage;

    if (currentRating >= safeRating) {
      System.out.println(safetyMessage = "The current rating of the park is " + currentRating + " star, therefore it's still safe.");
    } else {
      System.out.println(safetyMessage = "The current rating of the park is " + currentRating + " star, therefore it is not safe.");
    }
  }
}
