/* The three gestures used in base Rock Paper Scissors are rock, paper,
and scissors. The way these are scored is as such: Rock beats Scissors,
Scissors beats Paper, Paper beats Rock. It gets a lot more complicated
when you introduce new gestures, but let's keep it simple for now.
We're definitely going to need a way to decide who has won and who has lost, or
whether the round has ended in a draw. Using the rules provided, give us an
engine for deciding this based on the player's moves.*/

//-----------Task1------------//



import java.util.Scanner;
import java.util.Random;

public class Task1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();

      int playerWins = 0;
      int computerWins = 0;

      while (true) {
         System.out.print("Enter your choice (rock, paper, scissors, quit): ");
         String playerChoice = input.nextLine().toLowerCase();

         if (playerChoice.equals("quit")) {
            break;
         }

         int computerChoice = random.nextInt(3) + 1;
         String computerChoiceString;

         switch (computerChoice) {
            case 1:
               computerChoiceString = "rock";
               break;
            case 2:
               computerChoiceString = "paper";
               break;
            case 3:
               computerChoiceString = "scissors";
               break;
            default:
               computerChoiceString = "Invalid choice";
               break;
         }

         System.out.println("Computer chose " + computerChoiceString);

         if (playerChoice.equals("rock")) {
            if (computerChoiceString.equals("scissors")) {
               System.out.println("You win!");
               playerWins++;
            } else if (computerChoiceString.equals("paper")) {
               System.out.println("Computer wins!");
               computerWins++;
            } else if (computerChoiceString.equals("rock")) {
               System.out.println("It's a tie!");
            }
         } else if (playerChoice.equals("paper")) {
            if (computerChoiceString.equals("rock")) {
               System.out.println("You win!");
               playerWins++;
            } else if (computerChoiceString.equals("scissors")) {
               System.out.println("Computer wins!");
               computerWins++;
            } else if (computerChoiceString.equals("paper")) {
               System.out.println("It's a tie!");
            }
         } else if (playerChoice.equals("scissors")) {
            if (computerChoiceString.equals("paper")) {
               System.out.println("You win!");
               playerWins++;
            } else if (computerChoiceString.equals("rock")) {
               System.out.println("Computer wins!");
               computerWins++;
            } else if (computerChoiceString.equals("scissors")) {
               System.out.println("It's a tie!");
            }
         } else {
            System.out.println("Invalid choice, try again");
         }

         System.out.println("Player wins: " + playerWins + " Computer wins: " + computerWins);
         System.out.println();
      }

      System.out.println("Thanks for playing!");
      
      System.out.println("//-----------Final score:----------//");
      
       System.out.println(" Player wins: " + playerWins +"    "+ " Computer wins: " + computerWins);

      input.close();
   }
}
