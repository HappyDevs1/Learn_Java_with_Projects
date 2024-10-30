package ch4.exercises;
import java.util.Scanner;

public class Exercise4_2 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the dinosaur --> ");
    String dinoName = sc.next();

    switch (dinoName) {
      case "Velociraptor":
        System.out.println("This dinosaur must must be given water every 2 hours");
        break;
      case "Stegosaurus":
        System.out.println("This dinosaur must not be fed meat");
        break;
      case "Triceratops":
        System.out.println("This dinosaurs mst not be exposed to the sun");
        break;
      default:
        System.out.println("All dinosaurs must be fed twice per day");
    }
  }
}
