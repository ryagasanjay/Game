import java.util.*;
import java.lang.*;

public class Level2 extends Utility {

	Scanner scl = new Scanner(System.in);
	Level2Obstacles l2 = new Level2Obstacles();

	public Level2() {

	}

	public void start() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("^*^*^**^**^ Chapter 2 *^*^*^*^*^*^*^*^");
		Thread.sleep(2000);
		System.out.println("As Our player passed through the impossible jungle.");
		Thread.sleep(2000);
		System.out.println(
				"All he sees is an endless ocean. Past the ocean he sees the huge Mountains(^!^) where he thinks his final destination is.");
		Thread.sleep(2000);
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

		Thread.sleep(2000);
		System.out.println(
				"Hmm... I think it's telling me to go towards the mountains.. But for that i need a boat.. And i don't see one..");
		Thread.sleep(1000);
		System.out.println("Looks like i need to build one..!!");

		System.out.println("Goes to the nearby trees.");
		System.out.println("Use : knife, gun ");
		String in = "";
		int logs = 1;

		do {
			in = scl.next();
			if (in.equalsIgnoreCase("map"))
				System.out.println("Map cannot help you here");
			if (in.equalsIgnoreCase("knife")) {
				System.out.println(chop());
				if (logs == 2) {
					break;
				} else {
					logs++;
					System.out.println("You need more logs.. \n" + "Use:");
				}
			}
		} while (logs <= 5);
		System.out.println("Enter appropriate command to build the boat..");

		while (in.indexOf("build") < 0) {
			in = scl.nextLine();
			if (in.contains("build")) {
				System.out.println(build());
			} else {
				System.out.println("Sorry that command is Invalid");
				System.out.println("Enter appropriate command to build the boat..");
			}
		}

		// Obstacles Class
		Thread.sleep(1000);
		System.out.println(
				"Yohoo.. Now, i have the boat.. I can reach the Mountains with in no time.. Thank god i don't have to swim..\n"
						+ "Oh look.! There are some instructions on how to pass through the river safely.\n"
						+ " Input --> j: Commands info, d: I don't need any help");
		
		String le_inst = "";
		
		
		
		int steps = 1;
		do {
			le_inst = scl.next();

			if (le_inst == "i") {
				System.out.println("There are no puzzles at the moment");
			} else {
				System.out.println("Map keeps glowing until you see it.");
			}
		} while (input != 1);

	}

	@Override
	public String chop() {
		// TODO Auto-generated method stub
		return "Chop chop..!! You cut down the tree.";

	}

	public String build() {
		return "Thwad..!! Thwad..!! Thwad..!! Building a boat in 2 seconds..";
	}

}
