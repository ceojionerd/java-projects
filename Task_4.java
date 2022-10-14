import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
   public static void main(String[] args) {

      // generate winning numbers
      List<Integer> winningNum = new ArrayList<>();
      List<Integer> bonusNum = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < 6; i++) {
         while (true) {
            // get a random number between 1 to 49
            int winning = random.nextInt(40) + 1;
            int rand = random.nextInt(40) + 1;
            // add it to list if it is not exist
            if (!winningNum.contains(winning) || !winningNum.contains(rand)) {
               winningNum.add(winning);
               bonusNum.add(rand);
               break;
            }
         }
      }

      // take input from user
      Scanner scan = new Scanner(System.in);
      System.out.println("=============== Welcome to Finland Lottery System " +
            "===============");
      System.out.println("press enter key to continue...");
      String Input = scan.nextLine();
      System.out.println(Input);
      System.out.println("Enter the 6 numbers you want to " +
            "choose between 1 and 40");

      List<Integer> usrGuess = new ArrayList<>();
      List<Integer> bonusGuess = new ArrayList<>();

      for (int i = 0; i < 7; i++) {
         System.out.println("The numbers you have chosen are: "
               + usrGuess);
         System.out.print("Enter a number between 1-49: ");
         while (true) {
            try {
               String numberString = scan.nextLine();
               int number = Integer.parseInt(numberString);
               if (number >= 1 && number <= 40) {
                  usrGuess.add(number);
                  bonusGuess.add(number);
                  break;
               } else {
                  System.out.println(number +
                        " is not between 1 and 40. Please try again.");
               }
            } catch (NumberFormatException nfe) {
               System.out.println("Hey, that's not even a number. " +
                     "Please try again.");
            }
         }
      }

      System.out.println("\nMain Numbers: " + winningNum);
      System.out.println("Bonus Numbers: " + bonusNum);
      System.out.println("Your Guesses: " + usrGuess);

      usrGuess.retainAll(winningNum);
      System.out.println("Main Numbers Correct: " + usrGuess.size());

      bonusGuess.retainAll(bonusNum);
      System.out.println("Bonus Numbers Correct: " + usrGuess.size());

      if (usrGuess.containsAll(winningNum)) {
         System.out.println("Holy crap, you actually won. " +
               "How did you do that?");
      } else {
         System.out.println("Good Job!, But not jackpot...");
      }

      scan.close();
   }
}