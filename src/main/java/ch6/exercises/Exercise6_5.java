package ch6.exercises;

public class Exercise6_5 {
  public static void main(String[] args) {
    int[] dinoAges = { 40, 50, 80, 20, 110, 70, 150};
    int totalAge = 0;
    int totalLength = 0;

    for(int i = 0; i < dinoAges.length; i++) {
      totalAge += dinoAges[i];
      totalLength = dinoAges.length;
    }
    System.out.println("The average age of all dinosaurs is " + totalAge / totalLength);
  }
}
