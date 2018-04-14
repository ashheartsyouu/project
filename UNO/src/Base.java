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
		
		System.out.print("First Card: ");
		deck.gimmeACard().printInfo(); //still in the works
		
		System.out.println(p1 + "'s turn. What would you like to do?");
		System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
		int action = scnr.nextInt();
	
		switch(action) {
		case 1: 
			System.out.println("What card do you want to use?: "); //figure out a way to correlate the numbers with the hands so it works
			int cardNum = scnr.nextInt();
			
			System.out.println("Player placed the card: " + cardNum);
			break;
		case 2:
			System.out.println("Here is your card: ");
			player1.takeCard(deck.gimmeACard()); //need to make an array list if player's card to do
			break;
		case 3:  //how to go back to switch on the top after using it here
			player1.printHand();
			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
			action = scnr.nextInt();
			break;
		case 4: 
			System.out.println("Finishing turn");
			break;
		case 5: //how to go back to switch on the top after using it here
			System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
			action = scnr.nextInt();
		default:
			System.out.println("Please pick a valid option");	
			break;
		}
		
		
		
		
		
	}
	
	public void gameplay() { //still under construction (for now)
		/*if(cardNum.equals(firstCard)) {
		 * faceCard = cardNum
		 * }
		 * else if(cardNum != firstCard) {
		 * System.out.println("Take card back");
		 * }
		 * 
		 * if(
		 * 
		 */
	}
	


		
		
		
		

	
}
