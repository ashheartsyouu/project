import java.util.*;

public class Players {
	
	private String name;
	private ArrayList<Cards> hand;
	public ArrayList<Players> players = new ArrayList<Players>();
	private Scanner scnr = new Scanner(System.in);
	
	public Players(String name)
	{
		this.name = name;
		hand = new ArrayList<Cards>();
	}
	
	public Players() {
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

	/**
	 * @return the hand
	 */
	public ArrayList<Cards> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<Cards> hand) {
		this.hand = hand;
	}

	public void takeCard(Cards aCard)
	{
		hand.add(aCard);
	}
	
	public void printHand()
	{
		System.out.println(name + "'s Hand:");
		for(Cards aCard: hand)
		{
			aCard.printInfo();
		}
	}
	
	public void addComputer() {
		name = "Computer";
		Players comp = new Players(name);
		players.add(comp);
	}
	
	public void addPlayer() {
		System.out.println("Please enter a name for Player:");
		name = scnr.next();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		Players aPlayer = new Players(name);
		players.add(aPlayer);
		isThereAPlayer();
	}
	
	public void isThereAPlayer() {
		System.out.println("Do you have players to add? Y or N");
		String response = scnr.next();
		if (response.toUpperCase().equals("Y")) {
			addPlayer();
		}
		else { 
			return;
		}
		
	}
	
	public void printPlayers() {
		int i = 0;
		for (Players thePlayer: players) {
			System.out.println("Player " + (i + 1) + " is " + players.get(i).getName());
			i++;
		}
	}
	

}
