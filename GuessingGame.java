// CS 141
// Guessing a randome number through console interaction 
// Lab: Guessinggame


import java.util.*;

public class GuessingGame {
   public static void main(String args[]) {
     Random r=new Random();

      Scanner console = new Scanner(System.in);
      int mostRecentGame = 0;
      int best = 9999;
      int games = 1;
      int guesses = 0;
      String response = " ";
      
      mostRecentGame = playGame(r, console);
      char Command = ' ';
      intro();
      
      while(Command == 'Y'){
         guesses = playGame(r,console);
         games++;
         guesses +=guesses;
         if(guesses > best)
            best = guesses;
         System.out.print("another game(y/n)? ");
         Command = Character.toUpperCase(console.next().charAt(0));
      }
      results(games, guesses, best);
   }

      

      /*if (mostRecentGame < best) {
         best = mostRecentGame;
      }
      guesses+= mostRecentGame;
      System.out.println ("Do you want to play gain?");
      response = console.next();
      response = response.toLowerCase();
      while (!(response.charAt(0) == 'n')) {
         mostRecentGame = playGame(console);
         if (mostRecentGame < best) {
            best = mostRecentGame;
         }
         guesses+= mostRecentGame;
         games++;
         System.out.println ("Do you want to play gain?");
         response = console.next();
         response = response.toLowerCase();
         if (!(response.charAt(0)=='y') && !(response.charAt(0) == 'n')){
            System.out.println("Please enter a valid answer (yes or no)");
            response = console.next();
            response = response.toLowerCase();
         }
      }*/
   
   
   
   public static void intro() { //gives the intro to the player
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and");
      System.out.println("100 and will allow you to guess until");
      System.out.println("you get it. For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
      System.out.println();
   }
   
   //tells the player whether their answer is higher or lower. Returns number of guesses
   public static int playGame(Random r, Scanner console) {
      //Random r = new Random();
      int randomNumber = r.nextInt(100)+1;
      System.out.print("I'm thinking of a number between 1 and 100: " );
      int response = console.nextInt();
      int guesses = 1;
      while (response != randomNumber) {
         if (response < randomNumber) {
            guesses++;
            System.out.print("It's higher than your guess.\nGuess it again: ");
            response = console.nextInt();
         } else {
            guesses++;
            System.out.print("It's lower than your guess.\nGuess it again: ");
            response = console.nextInt();
         }
      }
      if (guesses == 1) {
         System.out.println("You got it right in " + guesses + " guess.");
      } else {
         System.out.println("You got it right in " + guesses + " guesses.");
      }
      return guesses;
   }
   
   //takes in the number of games, total number of guesses,
   //and gives the results to the player.
   public static void results(int games, int guesses, int best) { 
      double guessesPerGame = guesses/games;
      System.out.println("Overall results:");
      System.out.println("\ttotal games = " + games);
      System.out.println("\ttotal guesses = " + guesses);
      System.out.println("\tguesses/game = " + guessesPerGame);
      System.out.println("\tbest game = " + best);
   }
}