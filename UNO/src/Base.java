import java.util.*;
public class Base {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to UNO!");
		System.out.println("Please enter Player 1's name: ");
		String p1 = scnr.nextLine();
		System.out.println("Please enter Player 2's name, or type 'n' if there is none: ");
		String p2 = scnr.nextLine();
		
		
		
		Deck deck = new Deck();
		Players player1 = new Players(p1);
		
		/*if(p2.toLowerCase() != "n") {
		
		}
		else {
			Players player2 = new Players(p2);
		}*/
		
		Players player2 = new Players(p2);
		
		
		
		for(int i = 0; i < 7; ++i) {
			player1.takeCard(deck.gimmeACard());
			
			player2.takeCard(deck.gimmeACard());
		}
				
		player1.printHand();
		player2.printHand();
		
		System.out.print("First Card: ");
		deck.gimmeACard().printInfo();
		
		System.out.println(p1 + "'s turn. What would you like to do?");
		
		
	}
	


		
		
		
		

	
}