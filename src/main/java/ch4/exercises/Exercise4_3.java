package ch4.exercises;
import java.util.Scanner;

public class Exercise4_3 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your total years of work experience below --> ");
    int employeeExp = sc.nextInt();

    if (employeeExp >= 10) {
      System.out.println("Well done! You are experienced enough to handle tougher dinosaurs");
    } else {
      System.out.println("Unfortunately you don't have enough experience to deal with tougher dinosaurs");
    }
    }
}
