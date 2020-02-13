import java.util.Scanner;

public class Jungle extends Utility {
	public final String x = "left right up down";
	// String[] count= {};
	Scanner sci = new Scanner(System.in);
	Utility u = new Utility();
	String in = "";

	public void start() throws Exception {
		findpattern();
		String path = followPath();

		while (!path.equalsIgnoreCase("down down right right") & !path.equalsIgnoreCase("down right down right")) {
			System.out.println(
					"C'mon.. Do You think you can reach the ladder there with this path pattern.. Try again..");
			path = followPath();
		}
		if (path.equalsIgnoreCase("down down right right") || path.equalsIgnoreCase("down right down right")) {
			Thread.sleep(2000);
			System.out.println("CONGRATULATIONS..!!"
					+ "\nYOU HAVE CLEARED YOUR FIRST OBSTACLE IN THIS ADVENTURE.\n\n BOY YOU'RE VERY SMART.. :P");
			System.out.println("********************Level I**************** \n" + "Welcome to the Jungle ");
			Thread.sleep(1000);

			System.out.println(
					"PLAYER is passing through the dense woods alone trying to find the next exit, day passes by and it goes dark.");
			Thread.sleep(1000);
			System.out.println("After 1 hr..");
			Thread.sleep(1000);
			System.out.println(
					"Player : WoW.. It's so dark. I can't see anything and i don't think i can go any further. \n"
							+ "I need to find some place to sleep to continue my journey..!!");
			Thread.sleep(1000);
			System.out.println("You found a Cave..!! Would you like to stay here ?"
					+ "\nInput: 1 = Go to Cave or 0 : Look for other options. ");
			int input = sci.nextInt();

			if (input == 1) {
				System.out.println("Player called it a night. zzzzZZZZZZZZ \n..."
						+ "He hears a sound in the middle of the night.. Somethings approaching him..");
				Thread.sleep(2000);
				System.out.println("Sounds like its a bear. You need to do something fast to scare it away."
						+ "\nWhat do you want to use? Gun or Knife?");
				Thread.sleep(1000);
				String in = "";
				do {
					in = sci.next();
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
					if (in.equalsIgnoreCase("map"))
						System.out.println("Map cannot help you here");
					if (in.equalsIgnoreCase("gun"))
						System.out.println("Gun cannot help you here");
					if (in.equalsIgnoreCase("knife"))
						System.out.println("Knife cannot help you here");
					if (in.equalsIgnoreCase("rope"))
						System.out.println(u.useRope());
				} while (!in.equalsIgnoreCase("rope"));
			}
		}

		Thread.sleep(1000);
		System.out.println("It's a beautiful morning to continue your adventure..");
		Thread.sleep(1000);
		System.out.println(
				"The player is almost out of the woods.. Suddenly something attacks the player and trying to kill him..");
		System.out.println("What do you want to use?");

		in="";
		do {
			System.out.println("Man it's trying to kill you..Choose something with which you can attack like a knife.. ");
			in = sci.next();
		}while(!in.equalsIgnoreCase("gun") & !in.equalsIgnoreCase("knife"));

		if (in.equalsIgnoreCase("gun"))
			System.out.println(u.shoot());
		if (in.equalsIgnoreCase("knife"))
			System.out.println(u.chop());

		
		System.out.println("Mysterious thing dropped a key. What do you want to do?\n" + "Press 1: Pick it up \n"
				+ "OR\n" + "0: Ignore it.");
		int key = sci.nextInt();
		Thread.sleep(1500);
		if (key == 1) {
			System.out.println("Player picked up the key and put in the bag.");
			u.addItemToBag("key");
		}else {
			System.out.println("Player chose to ignore it.. He might regret it later.. :P");
		}
		Thread.sleep(2000);
		System.out.println("Player safely came out of the Jungle.");
		Level2 l2 = new Level2();
		l2.start();
	}

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

	private void findpattern() {
		// TODO Auto-generated method stub
		System.out.println("The path you're looking for is in this navigational pattern"
				+ "Key words you can use are:\n up\n down\n left \n right");
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
