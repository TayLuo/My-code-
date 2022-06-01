// CS 145
// Assignment 2 phonebook
// the program is keep tracking of the phone booklist
// using the method of Linkedlist
// phonebook node & method test 
// Ke Tu

import java.util.LinkedList;

public class phoneBookTest{
   public static void main(String[] args){
      phoneBookManager book = new phoneBookManager( );
      book.add("Tay" , "lay", "356 890 123", "Bellingham", "ruwlw@yahoo.c0m", "2089 maylor St");
      book.add("uhy", "lay", "783 236 789", "Ferndale", "rurrwl@gmail.com", "2780 Alamba St");
      book.add("Harry", "Rube", "670 265 126", "deming", "arrw@hotmail.com", "3670 Brown St");
      book.add("John", "Russell", "360 278 7912", "Blain", "john0923@gmail.com", "3569 main St");
      book.toString();
      book.remove(0);
      book.modifyFirstName("John", 1);
      book.toString();
      book.modifyCity("Vermont", 0);
      book.toString();
   }
}
      
