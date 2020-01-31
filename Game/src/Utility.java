
public class Utility implements Actables {
	String mapInfo = "";  

	@Override
	public String useMap(String level) {
		// TODO Auto-generated method stub
		if(level == "Level1") {
			mapInfo = "You have entered Level 1.\n"
					+ "You need to find the right path to clear this level and,"
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
		return "";
		// TODO Auto-generated method stub
		
	}

}
