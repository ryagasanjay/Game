package objectOrientedAdventure;

public class Player {

	private String name;
	private int age;
	private String gender;
	private String dob;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "name=" + name + "," + " age=" + age + ", " + "gender=" + gender + ", dob=" + dob;
	}
	
	
	/**
	 * Method: Player() constructor for collecting the information of the player.
	 * @param name
	 * @param age
	 * @param gender
	 * @param dob
	 * */
	public Player(String name, int age, String gender, String dob) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}

}
