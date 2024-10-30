package ch4.exercises;
import java.util.Scanner;

public class Exercise4_5 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the dinosaur to see it's enclosure");
    String size = sc.next();

    switch (size) {
      case "XS":
        System.out.println("Extra small dinosaurs reside in an invisible barrier");
      case "S":
        System.out.println("Small dinosaurs reside in the extended invisible barrier");
      case "M":
        System.out.println("Medium dinosaurs reside in the animal welfare");
      case "L":
        System.out.println("Large dinosaurs reside in the expertise at every stage");
      case "XL":
        System.out.println("Extra large dinosaurs reside in the once stop shop");
    }
  }
}
