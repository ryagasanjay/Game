import java.util.ArrayList;

public class Utility implements Actables {
	String mapInfo = "";
	ArrayList<String> bag = new ArrayList<String>();

//	String[] bag = { "map", "gun", "knife", "rope" };
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

	public void getChoices() {

		for (String i : bag) {
			System.out.println(i);
		}
	}

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
}
