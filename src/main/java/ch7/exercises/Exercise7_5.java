package ch7.exercises;

public class Exercise7_5 {
  public static void main (String[] args) {
    greetGuest("Dino3", "Happy");
  }

  public static void greetGuest(String dinoName, String guestName) {
    System.out.println("Hello " + guestName + ", you are here to see " + dinoName);
  }
}
