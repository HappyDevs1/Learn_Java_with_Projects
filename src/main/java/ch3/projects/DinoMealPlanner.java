package ch3.projects;

public class DinoMealPlanner {
  public static void main (String[] args) {
    double weight = 2000;
    double feedingPerKg = 0.15;

    int feedingRequired = (int) ((feedingPerKg * weight));
    int feedingPerDay = feedingRequired * 2;

    System.out.println("Our 2000 kg dinosaur need to eat " + feedingPerDay + " kg daily, " + "which means we need to serve " + feedingRequired + " kg per feeding.");
  }
}
