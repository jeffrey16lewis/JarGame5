import java.util.Scanner;
import java.util.Random;

public class Jar {
  public static String itemName;
  public static int maxNumber;
  public static int guesses;
  
  
  public static String getItemName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Specify item name: ");
    itemName = scanner.nextLine();
    return itemName;
  }
  public static int getMaxNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many " + itemName + " would you like?  ");
    maxNumber = scanner.nextInt();
    return maxNumber;
  }

  public static int fill() {
    Random random = new Random();
    int count = 0;
    int randNum = random.nextInt(maxNumber) + 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess how many " + itemName + " are in the jar. "
                         + " Pick a number between 1 and " + maxNumber + ": ");
    do {
      System.out.println("Guess: ");
    guesses = scanner.nextInt();
       count++;
    } while (guesses != randNum);
    
      if (guesses == randNum) {
        System.out.println("You guessed in " + count + " tries");
      } 
       
     
    return guesses;
    
    
    
  }
  
   

}