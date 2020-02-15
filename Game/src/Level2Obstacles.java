
public class Level2Obstacles implements Obstacles {

	@Override
	public String instructions() {
		// TODO Auto-generated method stub
		return "You have reached the Floating mountains..\n"
				+ "Near the entrance of the mountains you will see a HUGE TREE\n"
				+ "There will be a FLAMING RED DRAGON which breathes FIRE guarding the Tree.. \n"
				+ "If you fight the dragon you need to defeat it and tame it to gain access to the mountain peak.\n"
				+ "Once you reach the mountain peak Place the totem to lift the curse of the totem and finish this adventure.";
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Boat Controls: \n" + "Enter : \n" + "right : Steering right \n" + "left  : Steering left \n"
				+ "fwd   : Moving the boat forward \n" + "stop  : Stopping the boat \n";
	}

	/**
	 * Method: hpDamaged.
	 * Dragon Obstacle damage counter
	 * */
	@Override
	public int hpDamaged(int number) {
		// TODO Auto-generated method stub
		int randomInt = (int) (100.0 * Math.random());
		return randomInt;
	}

	public String getInput(String input) {

		switch (input) {
		case "right":
			return "Steering right";
		case "left":
			return "Steering left";
		case "fwd":
			return "Moving the boat forward";
		case "stop":
			return "Stopping the boat";
		case "read":
			return instructions();
		case "throw":
			return "Threw the paper away..";
		default:
			return "A boat cannot do that. You know it.";
		}
	}

}
