import java.util.*;
public class Base {
	private ArrayList<Players> players = new ArrayList<Players>();
	private static Scanner scnr = new Scanner(System.in);
	private static Base b;
	private Players p = new Players();
	private Players currPlayer; 
	
	
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
		
		PickUpCards deck = new PickUpCards();
		
		for(Players p: players) {
			p.generateHand();
			p.printHand();
		}	
		
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
			System.out.println("Player " + (i + 1) + " is " + players.get(i).getName());
			i++;
		}
		System.out.println("-------------------------------------------");
	}
	
	public Players getCurrentPlayer() {
		return currPlayer;
	}
	
	public void playerTurn() {
		//INSERT THE CODE FOR THE CHOICES THE PLAYERS CAN DO
		System.out.println("PLEASE FIX ME: playerTurn() method");
	}
	
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
	}
