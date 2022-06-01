// CS 145
// Assignment 2 phonebook
// the program is keep tracking of the phone booklist
// using the method of Linkedlist
// phonebook node methods
// Ke Tu

import java.util.LinkedList;

public class phoneBookManager{
      
   public PhoneBookNode front;// first value in the list
   
   public phoneBookManager(){// constructs an empty list
      front = null;
   }
   
   // add value to the end of the list
   public void add(String fName, String lName, String PhoneNum, String city, String email, String address){
      if (front == null){
         front = new PhoneBookNode(fName, lName, PhoneNum, city, email, address);
      } else{
         PhoneBookNode current = front;
         while (current.next != null){
            current = current.next;
         }
         current.next = new PhoneBookNode(fName, lName, PhoneNum, city, email, address);
      }
      System.out.println();
   }   
   
   // add value at the given index
   public void add(String fName, String lName, String PhoneNum, String city, String email, String address, int index){
      if (index == 0){
         front = new PhoneBookNode(fName, lName, PhoneNum, city, email, address, front);
      } else {
         PhoneBookNode current = front;
         for (int i = 0; i < index - 1; i++){
            current = current.next;
         }
         current.next = new PhoneBookNode(fName, lName, PhoneNum, city, email, address, current.next);
      }
      System.out.println();
   }
   
   public PhoneBookNode nodeAt(int index){
      PhoneBookNode current = front;
      for (int i = 0; i < index; i++){
         current = current.next;
      }
      return current;
   }
   
   //removeing method
   public void remove(int index){
      if (index == 0){
         front = front.next;
      } else {
         PhoneBookNode current = nodeAt(index - 1);
         current.next = current.next.next;
      }
      System.out.println();
   }
   
  
   // modify the first name
   public void modifyFirstName(String fName, int index){
      PhoneBookNode current = nodeAt(index);
      current.setfName(fName);
   }
   
   // modify the last name
   public void modifyLastName(String lName, int index){
      PhoneBookNode current = nodeAt(index);
      current.setlName(lName);
   }
   
   // modify the email address
   public void modifyEmailAddress(String email, int index){
      PhoneBookNode current = nodeAt(index);
      current.setEmail(email);
   }
   
   //modify the city method
   public void modifyCity(String city, int index){
      PhoneBookNode current = nodeAt(index);
      current.setCity(city);
   }
   
   // modify the phone number
   public void modifyPhoneNumber(String PhoneNum, int index){
      PhoneBookNode current = nodeAt(index);
      current.setPhoneNum(PhoneNum);
   }
   
   //modify the address
   public void modifyAddress(String address, int index){
      PhoneBookNode current = nodeAt(index);
      current.setAddress(address);
   }
    
   // displaying the phone book
   public String toString(){
      if (front == null){
         return "The phone book is empty";
      } else {
         PhoneBookNode current = front;
         while (current != null){
            System.out.println(current);
            current = current.next;
         }  
      }
      return " ";
   }
}
    
