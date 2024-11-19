package ch7.exercises;

public class Exercise7_3 {
  public static void main (String[] args) {
    dinoAv(100, 3000, 4000);
  }
  public static void dinoAv (int... average) {
    int totalAv = 0;
    for (int i = 0; i < average.length; i++) {
      totalAv += average[i];
    }
    int finalAv = totalAv / average.length;
    System.out.println("The average height of the dinosaur is: " + finalAv);
  }
}
