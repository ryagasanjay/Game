package objectOrientedAdventure;

public interface Actables {

	public final int HP_LOST_WEN_GUNNED = 30;
	public final int HP_LOST_WEN_KNIVED = 15;

	public String useMap(String level);

	public int usedGun();

	public int useKnife();

	public String useRope();

	public String shoot();

	public String chop();

	public String examine(String in);

	public String UseItemfromBag(String in);
	
	public void findPattern();

}
