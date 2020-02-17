package objectOrientedAdventure;

import java.util.Scanner;

public class Jungle {
	public final String x = "left right up down";
	// String[] count= {};
	Scanner sci = new Scanner(System.in);
	int numberOfMoves;
	Utility u;
	String in = "";

	/**
	 * Method: Start Jungle class Constructor.
	 * 
	 * @param Utility Object
	 */
	public Jungle(Utility u2) {
		// TODO Auto-generated constructor stub
		this.u = u2;
	}

	/**
	 * Method: Start .
	 * 
	 * @param int number of Moves calls the findPattern first riddle. At the end
	 *            calls the Level2 constructor
	 */
	public void start(int numberOfMoves) throws Exception {
		this.numberOfMoves = numberOfMoves;

		u.findPattern();
		String path = followPath();

		while (!path.equalsIgnoreCase("down down right right") & !path.equalsIgnoreCase("down right down right")) {
			System.out.println(
					"C'mon.. Do You think you can reach the ladder there with this path pattern.. Try again..");
			path = followPath();
		}
		if (path.equalsIgnoreCase("down down right right") || path.equalsIgnoreCase("down right down right")) {
			System.out.println("CONGRATULATIONS..!!"
					+ "\nYOU HAVE CLEARED YOUR FIRST OBSTACLE IN THIS ADVENTURE.\n\n BOY YOU'RE VERY SMART.. :P \n ");
			Thread.sleep(2000);
			System.out.println("********************Level I: NOBODY IS SAFE IN THE JUNGLE**************** \n \n");
			Thread.sleep(1000);

			System.out.println(
					"PLAYER is passing through the dense woods alone trying to find the next exit, day passes by and it goes dark.");
			Thread.sleep(1000);
			System.out.println("After 1 hr..");
			Thread.sleep(1000);
			System.out.println(
					"Player : WoW.. It's so dark. I can't see anything and i don't think i can go any further. \n"
							+ "I need to find some place to sleep to continue my journey..!!\n");
			Thread.sleep(1000);
			System.out.println("You found a Cave..!! Would you like to stay here ?"
					+ "\nInput: 1 = Go to Cave or 0 : Look for other options. ");

			int input = 0;
			do {
				input = sci.nextInt();
				numberOfMoves++;
			} while (input != 1 & input != 0);

			if (input == 1) {
				System.out.println("Player entered the cave. Player called it a night. zzzzZZZZZZZZ \n..."
						+ "You hear a sound in the middle of the night.. Somethings approaching you..\n");
				Thread.sleep(2000);
				System.out.println("Sounds like its a bear. You need to do something fast to scare it away."
						+ "\nWhat do you want to use? Gun or Knife?");
				Thread.sleep(1000);
				String in = "";
				do {
					in = sci.next();
					numberOfMoves++;
					if (in.equalsIgnoreCase("gun")) {
						System.out
								.println("You used gun to shoot. Bear ran away, scared by the loud noise of the Gun.");
						break;
					} else if (in.equalsIgnoreCase("knife")) {
						Thread.sleep(1000);
						System.out.println(
								"You used a knife on the Bear. Now it's angry. It's charging towards you.. What do you want to do?\n"
										+ "Hint: Bears are afraid of loud noises and fire.");
					} else {
						System.out.println("Hey be serious.. It might kill you.."
								+ "Did you know: Bears tend to kill people if they are funny with them :P");
					}
				} while (!in.equalsIgnoreCase("gun"));

			}

			if (input == 0) {
				System.out.println("Looking for high ground to setup camp." + "\nMoving along the river..");
				Thread.sleep(2000);
				System.out.println("Found a gaint tree with an empty tree house. But it's unreachable..");
				Thread.sleep(1000);
				System.out.println("You need something to anchor. You need something to pull yourself up.");
				Thread.sleep(1000);
				System.out.println("Use : ");

				do {
					in = sci.next();
					numberOfMoves++;
					if (in.equalsIgnoreCase("map"))
						System.out.println("Map cannot help you here");
					if (in.equalsIgnoreCase("gun"))
						System.out.println("Gun cannot help you here");
					if (in.equalsIgnoreCase("knife"))
						System.out.println("Knife cannot help you here");
					if (in.equalsIgnoreCase("rope"))
						System.out.println(u.useRope());
				} while (!in.equalsIgnoreCase("rope"));
				Thread.sleep(1000);
				System.out.println("Player called it a night. zzzzZZZZZZZZ \n...");
			}
		}

		System.out.println("You can now sleep peacefully.\n\n");
		Thread.sleep(2000);
		System.out.println("After 8 hrs..");
		Thread.sleep(2000);
		System.out.println(
				"It's a beautiful morning to continue your adventure.. Player woke up and running towards the exit of the jungle..");
		Thread.sleep(1000);
		System.out.println("The player is almost out of the woods.. Suddenly something attacks the player.. \n");
		System.out.println("What do you want to do?\n" + "Use: ");
		u.getChoices();

		in = "";
		do {
			if (!in.isBlank()) {
				System.out.println(
						"Man it's trying to kill you..Choose something with which you can attack like a knife..\n ");
			}
			in = sci.next();
			numberOfMoves++;
		} while (!in.equalsIgnoreCase("gun") & !in.equalsIgnoreCase("knife"));

		if (in.equalsIgnoreCase("gun"))
			System.out.println(u.shoot());
		if (in.equalsIgnoreCase("knife"))
			System.out.println(u.chop());

		Thread.sleep(1500);
		System.out.println("Mysterious thing dropped a key. What do you want to do?\n" + "Press 1: Pick it up \n"
				+ "OR\n" + "0: Ignore it.");
		Thread.sleep(1500);

		int key = 0;
		do {
			key = sci.nextInt();
			numberOfMoves++;
		} while (key != 1 & key != 0);

		if (key == 1) {
			System.out.println("Player picked up the key and put in the bag.\n");
			u.addItemToBag("key");
		} else {
			System.out.println("Player chose to ignore it.. He might regret it later.. :P\n");
		}

		Thread.sleep(1500);
		System.out.println("Player safely came out of the Jungle.\n \n");
		System.out.println("Total number of moves until Jungle is finished is :" + numberOfMoves);
		Level2 l2 = new Level2(u, numberOfMoves);
		l2.start();
	}

	/**
	 * Method: followPath() method to take the right pattern commands
	 */
	private String followPath() {
		String pattern = "";
		String[] count = {};
		do {
			if (count.length == 0) {
				System.out.println("Enter the pattern");
			} else if (count.length < 4 || count.length > 4) {
				System.out.println("You have entered insufficient path commands. Please try again..!!");
			}
			pattern = sci.nextLine();
			numberOfMoves++;
			count = pattern.split(" ");
			// System.out.println(count.length);
		} while (count.length != 4);

		if (count.length == 4) {
			for (int i = 0; i < count.length; i++) {
				if (x.indexOf(count[i]) < 0) {
					// do nothing
					System.out.println(count[i]);
					System.out.println("You have entered invalid path commands. Please try again..!!");
					followPath();
					break;
				} else {
					// do nothing
				}
			}
		}
		return pattern;
	}
}
