import java.util.*;
import java.lang.*;

public class Level2 extends Utility {

	Scanner scl = new Scanner(System.in);
	Level2Obstacles l2 = new Level2Obstacles();
	Utility u = new Utility();

	public Level2() {

	}

	public void start() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("^*^*^**^**^ Chapter 2 *^*^*^*^*^*^*^*^");
		Thread.sleep(1000);
		System.out.println("As Our player passed through the impossible jungle.");
		Thread.sleep(1000);
		System.out.println(
				"All he sees is an endless ocean. Past the ocean he sees the huge Mountains(^!^) where he thinks his final destination is.");
		Thread.sleep(1000);
		System.out.println("The Map is glowing again..What do you want do ? 1: View or 0: put it away");

		int input = 0;
		do {
			input = scl.nextInt();

			if (input == 1) {
				System.out.println("Map lays down the path through the water to the mountains and a boat.");
			} else {
				System.out.println("Map keeps glowing until you see it.");
			}
		} while (input != 1);

		Thread.sleep(1000);
		System.out.println(
				"Hmm... I think it's telling me to go towards the mountains.. But for that i need a boat.. And i don't see one..");
		Thread.sleep(1000);
		System.out.println("Looks like i need to build one..!!");

		System.out.println("Goes to the nearby trees.");
		System.out.println("Use : knife, map ");

		buildBoat();
		// Obstacles Class
		Thread.sleep(1000);
		System.out.println(
				"Yohoo.. Now, i have the boat.. I can reach the Mountains with in no time..\n Thank god i don't have to swim..\n");

		System.out.println(
				"I have to take the boat to the ocean to get to the Mountains.. \n " + "Use: push" + "\n anchor");

		String le_inst = "";
		boolean anchorNow = false;
		do {
			le_inst = scl.next();

			if (le_inst.contains("push")) {
				System.out.println("You pushed the boat to the ocean.\nBoat is now floating and ready to steer away..");
				System.out.println(l2.info());

				for (int step = 1; step < 5; step++) {
					if (step == 1) {
						le_inst = "";
						le_inst = scl.next();
						System.out.println(l2.getInput(le_inst));
						Thread.sleep(500);
						System.out.println(
								"Drrrrrrrr..... As the boat is moving forward.. A Gaint whale is coming on the left side."
										+ "\n");
						Thread.sleep(500);
					}
					if (step == 2) {
						System.out.println("player need to do something very fast: Enter right or left");
						le_inst = "";
						le_inst = scl.next();
						Thread.sleep(500);
						System.out.println(l2.getInput(le_inst));
						Thread.sleep(500);
					}
					if (step == 3) {
						le_inst = "";
						System.out.println(
								"You see a gaint sea gull monster approaching at you.. What do you want to use?");
						u.getChoices();
						le_inst = scl.next();
						System.out.println(u.UseItemfromBag(le_inst));
						System.out.println("Phew.. Looks like i'm out of danger..\n"
								+ "Look. (0-0) that Sea Gull has dropped something..");
						System.out.println("A big Oval hard shell.. It could be an Egg? Ball? What do you think? ");
						le_inst = scl.next();
						System.out.println(u.examine(le_inst));
						System.out.println("Picked it up and stuffed it in the Bag.");
					}
					if (step == 4) {
						System.out.println("The boat has almost reached the shore. You need to stop now..");
						le_inst = "";
						while (!le_inst.contains("stop")) {
							le_inst = scl.next();
							if (le_inst.contains("stop")) {
								System.out.println(l2.getInput(le_inst));
								anchorNow = true;
								break;
							}
						}
					}
				}

			}
			if (le_inst.contains("anchor")) {
				System.out.println("Boat is already anchored and ready to be steered away. Let's GOOOO  <-(0)-> .. ");
			}
			if (anchorNow) {
				Thread.sleep(1000);
				System.out.println(
						"You have reached the Floating mountains ___^`^`^`__ .. Dropping the anchor 0-> now.  ");
				break;
			}
		} while (le_inst.indexOf("push") < 0);

		bossLevel();

	}

	private void bossLevel() throws Exception {

		System.out.println("A big paper came flying fell on your face.. Would you like to read? Input: yes or no ");
		String inst = scl.next();
		System.out.println(l2.getInput(inst));

		System.out.println(
				"Player is walking towards the entrance of the Mountain. He sees a lot of trees surrounding a Huge Mother Tree..");
		System.out.println("\\n ')`('  \\n");
		Thread.sleep(500);
		System.out.println("Suddenly Out of no where the breath of dragon almost burned the player..");
		System.out.println("Player peeks into the entrance. The dragon is enraged for some reason.\n"
				+ "You need to Tame it somehow. What do you want to do?\n" + "Attack  or Try to calm the dragon\n"
				+ "Enter your choice : attack or calm");

		inst = scl.next();
		if (inst.contains("calm")) {
			System.out.println("What do you think you can use to make the dragon calm? Use:");
			u.getChoices();
		}
		if (inst.contains("attack")) {
			Thread.sleep(1000);
			System.out.println("Attacking the Dragon");
			int dragonHp = Obstacles.DragonHP;
			String ins = "";
			while (dragonHp > 100) {
				
				System.out.println("How do you want to attack? Gun or Knife");
				ins = scl.next();
				dragonHp -= attackDragon(ins);
			}
			System.out.println("The Dragon is breathing fire and will incenerate you..");
			System.out.println("How do you want to defend yourself? roll or duck");
			ins = scl.next();
			if (ins.contains("roll")) {
				System.out.println("You rolled to the left.. and the dragon egg fell on the ground..");
			}
			if (ins.contains("duck")) {
				System.out.println("You ducked from fire and escaped.. dragon egg fell from the bag on the ground..");
			}
			Thread.sleep(500);
			System.out.println("Dragon notices the egg and became calm.. Player picks it up and leaves it at the dragon hesistently..");
			Thread.sleep(500);
			System.out.println("Dragon became so calm and offered help to go to the mountain peak with its egg.");
			Thread.sleep(500);
			System.out.println("Player reaches the Mountain peak and places the totem at its place.");
			Thread.sleep(500);
			System.out.println("Alicia: You have lifted the curse placed on the TOTEM and helped this place to be serene.");
			Thread.sleep(500);
			System.out.println("Thank you so much");
			Thread.sleep(1000);
			System.out.println("******* THE END *********");
		}

	}

	private int attackDragon(String ins) {
		// TODO Auto-generated method stub
		if (ins.contains("gun"))
			return u.usedGun();
		if (ins.contains("knife"))
			return u.useKnife();
		return 0;
	}

	@Override
	public String chop() {
		// TODO Auto-generated method stub
		return "Chop chop..!! You cut down the tree.";

	}

	public String build() {
		return "Thwad..!! Thwad..!! Thwad..!! Building a boat in 2 seconds..";
	}

	private void buildBoat() {
		String in = "";
		int logs = 1;

		do {
			in = scl.next();
			if (in.equalsIgnoreCase("map"))
				System.out.println("Map cannot help you here");
			if (in.equalsIgnoreCase("knife")) {
				System.out.println(chop());
				if (logs == 2) {
					in = "";
					break;
				} else {
					logs++;
					System.out.println("You need more logs.. \n" + "Use:");
				}
			}
		} while (logs <= 5);

		System.out.println(
				"There. I have enough logs now.. What do you want to do with the logs?" + "\nBuild" + "\nBurn");

		while (in.indexOf("build") < 0) {
			in = scl.nextLine();
			if (in.contains("build")) {
				System.out.println(build());
			} else if (in.indexOf("burn") == 0) {
				System.out.println(
						"Sorry.. Do you really want to burn the chopped logs.. then you wont be able to build the boat.");
				System.out.println("Enter appropriate command to build the boat..");
			}
		}
	}

}
