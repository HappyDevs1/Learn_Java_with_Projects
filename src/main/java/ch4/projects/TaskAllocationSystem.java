package ch4.projects;
import java.util.Scanner;

public class TaskAllocationSystem {
  public static void main (String[] args) {
    String role;
    int time = 0;
    double rating;

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the role --> ");
    role = sc.next();

    switch (role) {
      case "Feeding":
        time = 10;
        if (time >= 10 && time <= 19) {
          System.out.println("You should be feeding the dinosaurs");
        } else {
          System.out.println("You don't have any task to do");
        }
        break;
      case "Cleaning":
        time = 7;
        if (time >= 6 && time <= 10) {
          System.out.println("You should be cleaning the park");
        } else {
          System.out.println("You can't clean when the park is opened");
        }
        break;
      case "Security":
        rating = 4.8;
        time = 14;
        if (rating < 4) {
          System.out.println("Alert! The park's rating has fallen, increase surveillance");
        } else if (rating > 4 && (time >= 10 && time <= 19) ) {
          System.out.println("Keep patrolling around the park to ensure everything is going well");
        } else {
          System.out.println("You are not on duty");
        }
        break;
      case "Tour guiding":
        time = 12;
        if (time >= 10 && time <= 19) {
          System.out.println("You are responsible for taking visitors for a tour");
        } else {
          System.out.println("You are off duty");
        }
        break;
    }
  }
}
