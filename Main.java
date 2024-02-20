import java.util.Scanner;

// Test Driver for Swimmer Class
class Main {
  public static void main(String[] args) {

    // Init best event times
    // -- swimmer 1
    Swimmer swimmer1 = new Swimmer("Ann Wu");
    swimmer1.setButterflyTime(new ElapsedTime(1,14,29));
    swimmer1.setBackstrokeTime(new ElapsedTime(1,42,2));
    swimmer1.setFreestyleTime(new ElapsedTime(1,5,10));

    // -- swimmer 2
    Swimmer swimmer2 = new Swimmer("Kathy Zimensky");
    swimmer2.setButterflyTime(new ElapsedTime(1,2,24));
    swimmer2.setBackstrokeTime(new ElapsedTime(1,52,50));
    swimmer2.setFreestyleTime(new ElapsedTime(1,4,10));
   
    // Testing getter methods
    // -- swimmer 1
    System.out.println("\nTESTING getter METHODS");
    System.out.println(swimmer1.getName() + 
                    " Butterfly: " + swimmer1.getButterflyTime() + 
                    " Backstroke: " + swimmer1.getBackstrokeTime() +
                    " Freestyle: " + swimmer1.getFreestyleTime());

    // -- swimmer 2
    System.out.println(swimmer2.getName() + 
                    " Butterfly: " + swimmer2.getButterflyTime() +
                    " Backstroke: " + swimmer2.getBackstrokeTime() +
                    " Freestyle: " + swimmer2.getFreestyleTime());

    // Testing toString method
    System.out.println("\nTESTING toString METHOD");
    System.out.println(swimmer1);
    System.out.println(swimmer2);

    // Testing bestEvent method
    System.out.println("\nTESTING bestEvent METHOD");
    System.out.println("Best event (" + swimmer1.getName() + "): " + 
                       swimmer1.bestEvent());
    System.out.println("Best event (" + swimmer2.getName() + "): " + 
                       swimmer2.bestEvent());
    
    // Testing betterAt method
    System.out.println("\nTESTING betterAt METHODS");
    System.out.println("The better swimmer of the butterfly is " +
                       swimmer1.betterAt(swimmer2, "butterfly"));
    
    System.out.println("The better swimmer of the backstroke is " +
                       swimmer1.betterAt(swimmer2, "backstroke"));

    System.out.println("The better swimmer of the freestyle is " +
                       swimmer1.betterAt(swimmer2, "freestyle"));
  }
}