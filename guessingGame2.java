// CS 145
// Guessing a randome number through console interaction 
// Lab: Guessinggame
// Ke Tu

import java.util.Scanner;
import java.util.*;

public class guessingGame2{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      int recentGame;
      int bestGame = 9999;
      int games = 1;
      int numGuesses = 0;
      String inputNumber;
      intro();
      recentGame = playGame(console);
      if (recentGame < bestGame){
         bestGame = recentGame;
      }
      numGuesses += recentGame; 
      System.out.print("Do you want play it again? ");
      inputNumber = console.next();
      inputNumber = inputNumber.toLowerCase();
      while (!(inputNumber.charAt(0) == 'n')) {
         recentGame = playGame(console);
         if (recentGame < bestGame) {
            bestGame = recentGame;
         }
         numGuesses+= recentGame;
         games++;
         System.out.println ("Do you want to play gain?");
         inputNumber = console.next();
         inputNumber = inputNumber.toLowerCase();
         if (!(inputNumber.charAt(0)=='y') && !(inputNumber.charAt(0) == 'n')){
            System.out.println("Please enter a valid answer (yes or no)");
            inputNumber = console.next();
            inputNumber = inputNumber.toLowerCase();
         } // yes and no command
      }
      result(games, numGuesses, bestGame);
   }
   
   //tells the player whether their answer is higher or lower. Returns number of guesses
   public static int playGame(Scanner console){
      int numGuesses = 1; 
      int RandomNumber  = new Random().nextInt(100) + 1;
      
      System.out.print("Enter an int from 1 to 100: ");
      int inputNumber = console.nextInt();
      while(inputNumber != RandomNumber){
         if (inputNumber > RandomNumber){
            numGuesses++;
            System.out.print("It's lower than your guess: ");
            inputNumber = console.nextInt();
         } else {
            numGuesses++;
            System.out.print("It's higher than your guess: ");
            inputNumber = console.nextInt();
            }
      }
      if (numGuesses == 1){
         System.out.println("You got it right in " + numGuesses + " guesses");
      } else {
         System.out.println("You got it right in " + numGuesses + " guesses");
      }
      return numGuesses;
   }
   
   //gives the intro to the player
   public static void intro(){
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and");
      System.out.println("100 and will allow you to guess until");
      System.out.println("you get it. For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
      System.out.println();
   }
   
   //takes in the number of games, total number of guesses,
   //and gives the results to the player.
   public static void result(int games, int numGuesses, int bestGame){
      double guessesPerGame = numGuesses / games;
      System.out.println("Overall results:");
      System.out.println("\ttotal games = " + games);
      System.out.println("\ttotal guesses = " + numGuesses);
      System.out.println("\tguesses/game = " + guessesPerGame);
      System.out.println("\tbest game = " + bestGame);
   }
}
   
   
   
