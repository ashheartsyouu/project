import java.util.*;
public class Base {
	public ArrayList<Players> players = new ArrayList<Players>();
	private Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		Players thePlayer = new Players();
		
		System.out.println("Welcome to UNO!");		
		System.out.println("Would you like to begin? Y or N");
		String response = scnr.next();
		
		thePlayer.addComputer();	//Generates computer player as players.get(0) --> index = 0
		
		if (response.toUpperCase().equals("Y")) {//Allows for players to be created and added to the players ArrayList
			thePlayer.isThereAPlayer();	//This function will call the add player function, if "y"
			thePlayer.printPlayers();	//Shows all players, including computer.
		}
		else {
			System.out.println("Goodbye!");
		}
		
		
		
		
		
		Deck deck = new Deck();
		
		
// 		for(int i = 0; i < 7; ++i) {
// 			player1.takeCard(deck.gimmeACard());
			
// 			player2.takeCard(deck.gimmeACard());
// 		}
				
// 		player1.printHand();
// 		player2.printHand();
		
// 		System.out.print("First Card: ");
// 		deck.gimmeACard().printInfo();
		
// 		System.out.println(p1 + "'s turn. What would you like to do?");
		
		
	}
	


		
		
		
		

	
}
