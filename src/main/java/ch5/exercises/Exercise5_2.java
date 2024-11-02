package ch5.exercises;
import java.util.Scanner;

public class Exercise5_2 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Is the dinosaur still hungry? --> ");
    String answer = sc.next();
    boolean isHungry = true;

    do {
      System.out.println("Feed the dinosaur one more time");
      isHungry = false;
    } while(answer == "Yes" && isHungry);
    }
  }