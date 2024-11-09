package ch6.exercises;

public class Exercise6_7 {
  public static void main(String[] args) {
    String[][] busSeating = {
            {"Seat 1", "Seat 2", "Seat 3"},
            {"Seat 4", "Seat 4", "Seat 5",},
            {"Seat 6", "Seat 7", "Seat 8"}
    };

    for(int i = 0; i < busSeating.length; i++) {
      for(int j = 0; j < busSeating[i].length; j++) {
        System.out.println(busSeating[i] [j] + " ");
      }
    }
  }
}
