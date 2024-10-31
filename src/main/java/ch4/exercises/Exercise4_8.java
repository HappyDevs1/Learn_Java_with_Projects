package ch4.exercises;
import java.util.Scanner;

public class Exercise4_8 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the hour of the day to see if the park is still open use the 24H format");
    int currentHour = sc.nextInt();

    if (currentHour >= 10 && currentHour <= 19) {
      System.out.println("The park is still open");
    } else {
      System.out.println("The park is currently closed");
    }
  }

}
