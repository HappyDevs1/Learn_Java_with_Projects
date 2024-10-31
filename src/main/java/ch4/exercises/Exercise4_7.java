package ch4.exercises;
import java.util.Scanner;

public class Exercise4_7 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the job title --> ");
    String jobTitle = sc.next();

    switch (jobTitle) {
      case "Receptionist":
        System.out.println("Dealing with the admin part");
        break;
      case "Care taker":
        System.out.println("Feeding and taking care of the dinosaurs");
        break;
      case "Cleaner":
        System.out.println("Cleaning in the Park");
        break;
      default:
        System.out.println("Working at the Park according to their delegation");
    }
  }
}
