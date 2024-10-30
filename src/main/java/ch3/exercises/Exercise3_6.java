package ch3.exercises;

public class Exercise3_6 {
  public static void main (String[] args) {
    double currentRating = 4.2;
    double goodRating = 4.0;

    boolean isRatingGood = (currentRating >= goodRating);

    System.out.println("The park is rated to be " + (isRatingGood ? "safe" : "not safe"));
  }
}