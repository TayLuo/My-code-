// CS 145
// Assignment 2 phonebook
// the program is keep tracking of the phone booklist
// using the method of Linkedlist
// phonebook node
// Ke Tu

public class PhoneBookNode {
   private PhoneBookNode front;
   private int index;
   private String fName;
   private String lName;
   private String PhoneNum;
   private String city;
   private String email;
   private String address;
   public  PhoneBookNode next; 
	
   public PhoneBookNode() { // constructor for the empty phoneBook
      front = null;	
   }
	
   public PhoneBookNode(String fName, String lName, String PhoneNum, String city, String email, String address){
      this.fName = fName; // second constructor for the phone book node
      this.lName = lName;
      this.PhoneNum = PhoneNum;
      this.city = city;
      this.email = email; 
      this.address = address;
      this.next = next;
   }
	
   public String toString() {// printing out the full name and the phone number and the city
      //String fullName = fName + " " + lName; // the full name is in a string.
      return "Full name: " + fName  + " " + lName + "\n" + "City: " + city + "\n" + "Phone Number: " + PhoneNum + "\n" + "Email: " + email + "\n" + "Address: " + address;
   }

	/**
	 * @return the front
	 */
   public PhoneBookNode getFront() {
      return front;
   }

	/**
	 * @param front the front to set
	 */
   public void setFront(PhoneBookNode front) {
      this.front = front;
   }

	/**
	 * @return the fname
	 */
   public String getfName() {
      return fName;
   }

	/**
	 * @param fname the fname to set
	 */
   public void setfName(String fname) {
      fName = fname;
   }
   
   public void setAddress(String address){
      address = address;
      }
      
   public String getAddress(){
      return address;
   }

	/**
	 * @return the lname
	 */
   public String getlName() {
      return lName;
   }

	/**
	 * @param lname the lname to set
	 */
   public void setlName(String lname) {
      this.lName = lname;
   }
   
   /**
	 * @return the city
	 */
   public String getCity() {
      return city;
   }

	/**
	 * @param city the city to set
	 */
   public void setCity(String city) {
      this.city = city;
   }


	/**
	 * @return the phoneNum
	 */
   public String getPhoneNum() {
      return PhoneNum;
   }

	/**
	 * @param phoneNum the phoneNum to set
	 */
   public void setPhoneNum(String phoneNum) {
      PhoneNum = phoneNum;
   }
   
   /**
	 * @return the email
	 */
   public String getEmail() {
      return email;
   }

	/**
	 * @param email the email to set
	 */
   public void setEmail(String email) {
      this.email = email;
   }
   
   /**
	 * @return the next
	 */
   public PhoneBookNode getNext() {
      return next;
   }

	/**
	 * @param next the next to set
	 */
   public void setNext(PhoneBookNode next) {
      this.next = next;
   }

   //creates node to store field information and create a next node
   public PhoneBookNode(String fName, String lName, String PhoneNum, String city, String email,String address, PhoneBookNode next){
      this.fName = fName;
      this.lName = lName;
      this.PhoneNum = PhoneNum;
      this.city = city;
      this.email = email;
      this.address = address;
      this.next = next;
   }
}
