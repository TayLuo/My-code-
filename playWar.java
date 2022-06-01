// CS 145
// lab 4 the deck of cards
// the program is playing a game called war
// who has the bigger number who wins the game
// using the method of stack
// Ke Tu


import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class playWar{
   
   private Stack<Card> player1;// define players
   private Stack<Card> player2;
   
   public playWar(){// constructor
      player1 = new Stack<>();
      player2 = new Stack<>();
   
      DeckofCards deck = new DeckofCards();// call the method from the deck of cards
      deck.shuffle();
      Card[] game = deck.getArray();
      for(int i = 0; i < 52; i++){
          
         player1.push(game[i]);
         player2.push(game[i + 1]);
        
         System.out.println(game[i]);
         System.out.println(game[i + 1]);
         i++;
      }
         System.out.println();
         
      while (!player1.isEmpty() || !player2.isEmpty()) {
         Card pc1 = player1.pop();// pop the card 
         Card pc2 = player2.pop();
         Stack<String> w1 = new Stack<>(); // winning stack
         Stack<String> w2 = new Stack<>();
      
         String ps1 = pc1.getFace();
         String ps2 = pc2.getFace();
         if(changeNum(ps1) > changeNum(ps2)){// comparin the numbers
            w1.push(ps1);//add to the winning stack to player1
            w1.push(ps2);
            System.out.println("ps1 is bigger than ps2");
         } else if (changeNum(ps1) < changeNum(ps2)){
            w2.push(ps1);// add to the winning stack to player2
            w2.push(ps2);
            System.out.println("ps1 is smaller than ps2");
         } else {
            System.out.println("ps1 equals ps2");
         }
      }
   }
      
   private int changeNum(String toInt){// changing from string to integer number
      if (toInt.equals("Three")){
         return 3;
      } else if(toInt.equals("Four")){
         return 4;
      } else if(toInt.equals("Five")){
         return 5;
      } else if(toInt.equals("Six")){
         return 6;
      } else if(toInt.equals("Seven")){
         return 7;
      } else if(toInt.equals("Eight")){
         return 8;
      }else if(toInt.equals("Nine")){
         return 9;
      }else if(toInt.equals("Ten")){
         return 10;
      } else if(toInt.equals("Jack")){
         return 11 ;
      }else if(toInt.equals("Queen")){
         return 12;
      }else if(toInt.equals("King")){
         return 13;
      } else if(toInt.equals("Ace")){
         return 14;
      } else if(toInt.equals("Deuce")){
         return 2;
      } else{
         return 0;
      }
   }
}  
