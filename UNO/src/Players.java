import java.util.*;

public class Players {
	
	private String name;
	private ArrayList<Cards> hand;
	
	public Players(String name)
	{
		this.name = name;
		hand = new ArrayList<Cards>();
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

	


}
