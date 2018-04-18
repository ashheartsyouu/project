import java.util.*;

public class Players {
	
	private String name;
	private ArrayList<Cards> hand;
	public ArrayList<Players> players = new ArrayList<Players>();
	private Scanner scnr = new Scanner(System.in);
	private PickUpCards deck = new PickUpCards();
	private String currPlayer;
	
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
			generateHand();
		}
	}

	public void generateHand() {
		deck.gimmeACard().printInfo();
	}
	
	public String getCurrentPlayer() {
		int i = 0;
		for(Players ap: players) {
			currPlayer = ap.getName();
		}
		return currPlayer;
	}
	
	

}
