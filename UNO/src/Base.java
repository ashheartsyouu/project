import java.util.*;
public class Base {
	public ArrayList<Players> players = new ArrayList<Players>();
	public static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		System.out.println("Welcome to UNO!");
		System.out.println("Would you like to begin? Y or N?");
		String response = scnr.next();
		
		if (response.toUpperCase().equals("Y")) {//Allows for players to be created and added to the players ArrayList
 			thePlayer.isThereAPlayer();	//This function will call the add player function, if "y"
+			thePlayer.printPlayers();	//Shows all players, including computer.
 		}
 		else {
-			System.out.println("Goodbye");
+			System.out.println("Goodbye!");
 		}
		
		
		/*
		System.out.println("Welcome to UNO!");
		System.out.println("Please enter Player 1's name: ");
		String p1 = scnr.next();
		System.out.println("Please enter Player 2's name: ");
		String p2 = scnr.next();
		
		
		
		PickUpCards deck = new PickUpCards();
		
		
		Players player1 = new Players(p1); //not needed but kept for reference
		Players player2 = new Players(p2);
		
		for(int i = 0; i < 7; ++i) { //use this to number the deck
			player1.takeCard(deck.gimmeACard());
			
			player2.takeCard(deck.gimmeACard());
		}

		System.out.print("First Card: ");
		deck.gimmeACard().printInfo();
		
		System.out.println(p1 + "'s turn. What would you like to do?");
		System.out.println("Your options are: \n" + "1: Place card on deck \n" + "2: Pick up card \n" + "3: See Hand \n" + "4: Finish Turn \n" + "5: See options again");
		int action = scnr.nextInt();
	
		switch(action) {
		case 1: 
			System.out.println("What card do you want to use?: "); //figure out a way to correlate the numbers with the hands so it works
			int cardNum = scnr.nextInt()-1;
			
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
		}*/
		
		
		
		
		
	}
	
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
	
	
	public void gameplay() {
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
