package ch6.exercises;

public class Exercise6_3 {
  public static void main(String[] args) {
    int[] dinoWeights = {7000, 50000, 500, 5000, 8000};
    int smallestDino = dinoWeights[0];

    for(int i = 1; i < dinoWeights.length; i++) {
      if (dinoWeights[i] < smallestDino) {
        smallestDino = dinoWeights[i];
      }
    }
    System.out.println("The smallest dinosaurs weighs " + smallestDino + " kg");
  }
}
