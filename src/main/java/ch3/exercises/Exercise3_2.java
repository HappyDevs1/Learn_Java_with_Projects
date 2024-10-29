package ch3.exercises;

public class Exercise3_2 {
  public static void main (String[] args) {
     double weight = 350;
     double foodPer50Kg = 50;
     double foodRequired = weight / foodPer50Kg;

    System.out.println("The nutrition required to feed the dinosaur is: " + foodRequired + " kg.");
  }
}
