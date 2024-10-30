package ch3.exercises;

public class Exercise3_5 {
  public static void main (String[] args) {
    int dino1Age = 54;
    int dino2Age = 42;

    int getOlderDino = (dino1Age > dino2Age) ? (dino1Age - dino2Age) : (dino2Age - dino1Age);

    System.out.println(getOlderDino);
  }
}
