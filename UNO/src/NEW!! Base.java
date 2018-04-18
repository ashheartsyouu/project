import java.util.*;
public class Base {
	private ArrayList<Players> players = new ArrayList<Players>();
	private static Scanner scnr = new Scanner(System.in);
	private static Base b;
	private Players p = new Players();
	 
	private PickUpCards deck = new PickUpCards();
	
	
	public Base() {
		
		System.out.println("Welcome to UNO!");
		System.out.println("Would you like to begin? Y or N?");
		String response = scnr.next();
		addComputer();
		
		if (response.toUpperCase().equals("Y")) {//Starts the set-up for the game
 			addPlayer();
 			printPlayers();
 		}
 		else {
			System.out.println("Goodbye!");
 		}
		
		/*
		for(Players p: players) { //repeat 7 times with this?
			p.printHand();
			p.generateHand();
			}
			*/
			
		
		System.out.println("-------------------------------------------");
		System.out.print("First Card: ");
		deck.gimmeACard().printInfo();
		
    
    
    //---------------------------------------------------------------------------------------------------------------
    // INSERT CODE TO CONTINUE THE GAME HERE
    //---------------------------------------------------------------------------------------------------------------
    
    } //end of base constructor
    
  public void addPlayer() { //Method to generate new players and to check if there are more players to be added
		System.out.println("Please enter a name for Player:");
		String name = scnr.next();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		Players Player = new Players(name);
		players.add(Player);
		
		boolean done = false;
		
		while(done == false) {
			System.out.println("Do you have players to add? Y or N");
			String response = scnr.next();
			if (response.toUpperCase().equals("Y")) {
				System.out.println("Please enter a name for Player:");
				name = scnr.next();
				name = name.substring(0, 1).toUpperCase() + name.substring(1);
				Players newPlayer = new Players(name);
				players.add(newPlayer);
			}
			else if (response.toUpperCase().equals("N")){ 
				done = true;
				return;
			}
			else {
				System.out.println("Please type a valid repsonse.");
			}
		}
		
	}
	
	public void addComputer() {	//Method to generate the computer player.
		String name = "Computer";
		Players comp = new Players(name);
		players.add(comp);
	}
	
	public void printPlayers() {
		int i = 0;
		System.out.println("-------------------------------------------");
		for (Players thePlayer: players) {
			System.out.println("Player " + (i + 1) + " is " + thePlayer.getName());
			i++;
		}
		System.out.println("-------------------------------------------");
	}
	
	public void playerTurn() { //need to fix
		System.out.println(p.currPlayer +"'s turn. What would you like to do?");
		System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
		int action = scnr.nextInt();
	}
		
		/*if(p.getCurrentPlayer().equals("Computer")) {
		
		}
		else {
		for(int i = 0; i < 7; ++i) { //to print out cards
			p.printHand();
			p.generateHand();
		}
		}*/
		
	
	/*	
	boolean repeat = false;
	while(repeat = true) {
		switch(action) {
		case 1: 
			System.out.println("What card do you want to use?: "); //figure out a way to correlate the numbers with the hands so it works
			int cardNum = scnr.nextInt()-1;
			System.out.println("Player placed the card: " + cardNum);
			repeat = false;
			break;
		case 2:
			System.out.println("Here is your card: ");
			getCurrentPlayer().takeCard(deck.gimmeACard()); //need to make an array list if player's card to do
			repeat = false;
			break;
		case 3:  //how to go back to switch on the top after using it here
			getCurrentPlayer().printHand();
			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
			action = scnr.nextInt();
			repeat = true;
			break;
		case 4: 
			System.out.println("Finishing turn");
			repeat = false;
			break;
		case 5: //how to go back to switch on the top after using it here
			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
			action = scnr.nextInt();
			repeat = false;
		default:
			System.out.println("Please pick a valid option");
			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
			repeat = true;
			break;
		}
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
			b = new Base();
			b.playerTurn();
			
	}
}
