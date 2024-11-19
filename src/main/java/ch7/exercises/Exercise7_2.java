package ch7.exercises;

public class Exercise7_2 {
  public static void main (String[] args) {
    dinoMeal(500);
  }
  public static void dinoMeal (int weight) {
    double meal;
    if (weight < 150) {
      meal = 1000;
    } else if (weight < 300) {
      meal = 2000;
    } else {
      meal = 3000;
    }
    System.out.println("This dinosaur must eat " + meal + " kg per day");
    return;
  }
}
