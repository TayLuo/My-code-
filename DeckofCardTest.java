import java.util.Stack;

public class DeckofCardTest{
   public static void main(String[] args){
      System.out.println("This is the instructioin for the war game");
      System.out.println("there will be two players with two different stacks of cards");
      System.out.println("whoever has the bigger number wins the game.");
      System.out.println("until the other player is out of cards");
      System.out.println();
   
   
      DeckofCards myDeckofCards = new DeckofCards();
      myDeckofCards.shuffle();
      
      for (int i = 1; i <= 52; i++){ // apply array here 
         System.out.printf("%-19s", myDeckofCards.dealCard());
         if (i % 2 == 0){
            System.out.println(); // main focus on Stack 
         }
      }
      
               
   }
}
 
 
 /* linklist dynamic- good but it is slow - bad 
 arrays fast it's all about effenciey 
 really fast hashtable 
 
 
 shuffle card random function stack method 
 deal with card 
 black jack 
 or whatever you chose 
 
 first step in the program: 
(method) user intstruction:
do you want to play a game? (while loop)
four people get it working (get it working first)

Arraylist for each stack for each player


two data structures: array and linkedlist(Used over and over again)


 
 
 
 */
 
