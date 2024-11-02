package ch5.exercises;

public class Exercise5_4 {
  public static void main (String[] args) {
    int[] dinoWeights = {1000, 3000, 5000, 2000, 4000};
    int totalWeight = 0;

    for (int weight: dinoWeights) {
      totalWeight += weight;
    }
    System.out.println("The total weight of the dinosaurs is " + totalWeight + " kg.");
  }
}
