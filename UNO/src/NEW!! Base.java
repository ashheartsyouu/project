import java.util.*;
 public class Base {
 	private ArrayList<Players> players = new ArrayList<Players>();
  	private static Scanner scnr = new Scanner(System.in);
  	private static Base b;
  	private static Rules r = new Rules();
  	private Players p = new Players();
 	private PickUpCards deck = new PickUpCards();
  	
  	
  	public Base() {

/*
 	public void playerTurn() { //need to fix
 		System.out.println(p.currPlayer +"'s turn. What would you like to do?");
 		System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
 		int action = scnr.nextInt();
  	}
  	
 */ 	
 		
 
 		

 	/*	
 +	boolean repeat = false;
 +	while(repeat = true) {
 +		switch(action) {
 +		case 1: 
 +			System.out.println("What card do you want to use?: "); //figure out a way to correlate the numbers with the hands so it works
 +			int cardNum = scnr.nextInt()-1;
 +			System.out.println("Player placed the card: " + cardNum);
 +			repeat = false;
 +			break;
 +		case 2:
 +			System.out.println("Here is your card: ");
 +			getCurrentPlayer().takeCard(deck.gimmeACard()); //need to make an array list if player's card to do
 +			repeat = false;
 +			break;
 +		case 3:  //how to go back to switch on the top after using it here
 +			getCurrentPlayer().printHand();
 +			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
 +			action = scnr.nextInt();
 +			repeat = true;
 +			break;
 +		case 4: 
 +			System.out.println("Finishing turn");
 +			repeat = false;
 +			break;
 +		case 5: //how to go back to switch on the top after using it here
 +			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
 +			action = scnr.nextInt();
 +			repeat = false;
 +		default:
 +			System.out.println("Please pick a valid option");
 +			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
 +			repeat = true;
 +			break;
 +		}
  		System.out.println("PLEASE FIX ME: playerTurn() method");
  	}
 	}
 	*/
 		
  	
  	public void nextTurn() {
  		for (Players p: players) {
 			if (1 == 1) {
 				System.out.println("PLEASE FIX ME: nextTurn() method");
 			}
 		}
 	}
 	
 	
 	
  	public static void main(String[] args) {
  		// TODO Auto-generated method stub
  			//b = new Base();
 			
  			r.beginGame();
 			
  	}
 }
