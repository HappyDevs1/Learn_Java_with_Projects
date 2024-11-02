package ch5.exercises;

public class Exercise5_5 {
  public static void main (String[] args) {
    int totalTickets = 300;

    while (totalTickets > 0) {
      System.out.println("Tickets left: " + totalTickets--);
    }
    System.out.println("Tickets are sold out");
  }
}
