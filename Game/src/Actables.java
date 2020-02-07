
public interface Actables {

	String choices[] = { "map", "gun", "knife", "rope" };
	public final int HP_LOST_WEN_GUNNED = 10;
	public final int HP_LOST_WEN_KNIVED = 5;

	public String useMap(String level);

	public int usedGun();

	public int useKnife();

	public String useRope();
	
	public String shoot();
	
	public String chop();

}
