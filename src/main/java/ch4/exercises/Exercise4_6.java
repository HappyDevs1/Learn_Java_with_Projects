package ch4.exercises;
import java.util.Scanner;

public class Exercise4_6 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the weight of the dinosaur");
    double dinoWeight = sc.nextDouble();

    if (dinoWeight < 1500) {
      System.out.println("This dinosaur must be fed once a day");
    } else if (dinoWeight >= 1500 && dinoWeight < 3000) {
      System.out.println("This dinosaur must be fed twice a day");
    } else if (dinoWeight >= 3000 && dinoWeight < 5000) {
      System.out.println("This dinosaur must be fed three times a day");
    } else {
      System.out.println("This dinosaur must be fed four times a day");
    }
  }
}
