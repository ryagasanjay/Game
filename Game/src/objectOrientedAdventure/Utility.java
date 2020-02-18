package objectOrientedAdventure;
import java.util.ArrayList;

public class Utility implements Actables {
	String mapInfo = "";
	ArrayList<String> bag = new ArrayList<String>();

//	String[] bag = { "map", "gun", "knife", "rope" };
	
	/**
	 * Method: Utility() constructor of the Utility class which contains all the methods required and be used by the character actables.
	 * 
	 * */
	public Utility() {
		bag.add("map");
		bag.add("gun");
		bag.add("knife");
		bag.add("rope");

	}
	
	public void addItemToBag(String item) {
		bag.add(item);
	}

	public void removeItemToBag(String item) {
		bag.remove(item);
	}

	@Override
	public String useMap(String level) {
		// TODO Auto-generated method stub
		if (level == "Level1") {
			mapInfo = "The game has two levels one is Level 1 which needs you to clear a jungle passage.\n \n"
					+ "Once you clear the Jungle your Map will let you know further information.\n \n"
					+ "For now, You have entered Level 1.\n \n" + "You need to find the right path to clear this level and,"
					+ "\nGo to the Jungle where your next endeavour awaits. ";
		}

		return mapInfo;
	}

	@Override
	public int usedGun() {
		// TODO Auto-generated method stub
		return HP_LOST_WEN_GUNNED;
	}

	@Override
	public int useKnife() {
		// TODO Auto-generated method stub
		return HP_LOST_WEN_KNIVED;
	}

	@Override
	public String useRope() {
		return "Clang.!! Anchored..!! CLimbing now.";
		// TODO Auto-generated method stub

	}

	@Override
	public String shoot() {
		// TODO Auto-generated method stub
		return "Boom..!! You killed it.";
	}

	@Override
	public String chop() {
		// TODO Auto-generated method stub
		return "Chopped into Two..!! You sliced it.";
	}

	/**
	 * Method: getChoices() will print all the items in a bag.
	 * Pattern path riddle
	 * */
	public void getChoices() {

		for (String i : bag) {
			System.out.println(i);
		}
	}

	/**
	 * Method: method to use any item present in the Bag.
	 * @param in
	 * specified item when using this method
	 * */
	@Override
	public String UseItemfromBag(String in) {
		// TODO Auto-generated method stub

		switch (in) {
		case "map":
			return "Map wont help you here.";
		case "gun":
			return shoot();
		case "knife":
			return chop();
		case "rope":
			return "Used rope. You tied it tightly";
		default:
			return "You cannot do that. You know it.";
		}
	}
	
	@Override
	public String examine(String in) {
		// TODO Auto-generated method stub
		if (in.contains("ball")) {
			return "No..It's a dragon egg.. Just hope there is no dragon around.. :O :O";
		}
		return "Yes..It's a dragon egg.. I can't believe it.I hope there is no dragon around.. :O :O";
	}

	/**
	 * Method: findPattern.
	 * Pattern path riddle Obstacle
	 * like down right left right
	 * */
	@Override
	public void findPattern() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println("The path you're looking for is in this navigational pattern"
				+ "Key words you can use are:\n" + "up \n" + "down \n" + "left \n" + "right");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (i == 3 && j == 3) {
					System.out.print(" |=|");
				}
			}
			System.out.println();
		}
	
		
	}
}
