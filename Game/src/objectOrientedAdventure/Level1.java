package objectOrientedAdventure;
import java.util.*;

public class Level1 {

	String in = "";
	int numberOfMoves = 0;
	Scanner sc = new Scanner(System.in);
	
	Utility u = new Utility();
	Jungle j = new Jungle(u);

	/**
	 * Level1 Constructor is the first class called for this adventure where it begins.
	 * */
	public Level1() {

		try {

			System.out.println("I am on my way to Home and walking towards the station.."
					+ "\n My mind is wandering everywhere thinking of what to create a game for my OOP Assignment. "
					+ "This is what i came up with the following adventure.. Hope you enjoy  :) ");
			String name, gender, dob;
			int age;
			System.out.println("Hi.. What's your name by the way ?");
			name = sc.next();
			numberOfMoves++;
			
			System.out.println("Hello " + name + " How old are ya?");
			age = sc.nextInt();
			numberOfMoves++;

			System.out.println(name + ", Are you a handsome boy or a beautiful girl?");
			gender = sc.next();
			numberOfMoves++;
			
			System.out.println(name + ",Could you enter the date of Birth for me?");
			dob = sc.next();
			numberOfMoves++;
			
			System.out.println("Grreat.. Let me save that for a moment");
			Player p = new Player(name, age, gender, dob);
			System.out.println("Awesome.. So " + p.getName()
					+ ",Let us begin with our little text adventure now.. So one day you are walking on the streets of Montreal..");
			System.out.println(
					"\n Wind gushes in.. an old crumbled paper flews past the guy in front of him and sticks on his face.\n"
							+ "He takes a look at the paper and he sees a map and there is an address inscribed on its back. \n \n"
							+ "TO ONLY THE MAN WITH HEART, COMES THE GREAT TREASURE. \n \n"
							+ "Excited the player wants to go pursue the adventure. So he goes to the mentioned address"
							+ "There he finds a box. He sees that the key to open a box is a combination of letters in order.\n"
							+ "Find the right keyword and you may open the box");
			Thread.sleep(1000);

			System.out.println("A,k,T,E \n" + "E,M \n" + "H,M,E,O");

			in = sc.nextLine();
			numberOfMoves++;
			while (!in.toLowerCase().trim().equalsIgnoreCase("take me home")) {
				System.out.println("Enter a valid input");
				in = sc.nextLine();
				numberOfMoves++;
			}

			startJourney();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method: Start Journey Begins the adventure after collecting the player information.
	 * At the end we call the Jungle class.
	 * */
	public void startJourney() {

		try {
			System.out.println(
					"He opens the box he finds a Totem.\nScreen flashes and he vanishes and enters a magical world.\n"
							+ "The totem comes to life and tells player that he needs to return him to his resting place in order to lift the curse on him."
							+ "Player thinks this could give him very good content for his paper. \n"
							+ "Do you want to play along ? \n yes or no");

			in = sc.next();
			numberOfMoves++;
			while (!in.toLowerCase().equalsIgnoreCase("yes") && !in.toLowerCase().equalsIgnoreCase("no")) {
				System.out.println("Enter a valid input");
				in = sc.next();
				numberOfMoves++;
			}
			if (in.equalsIgnoreCase("no")) {
				sc.close();
				System.out.println("OH.!! Thats so Bad.. Just rerun if you wanted to have fun some time.");
			} else {
				Thread.sleep(1000);
				System.out.println(
						"Totem: Hi Player.. My name is alicia. Please take these items which will help you in your journey.\n \n");
				Thread.sleep(1000);
				System.out.println("Player: Alicia hands over a\n"
						+ "\nMap: To navigate to the destination present deep inside the mountains."
						+ "\nTorch: to see places where its dark"
						+ "\nGun: To protect himself. It contains only 6 rounds. Use them wisely and when absolutely necessary."
						+ "\nKnife: To use as melee weapon."
						+ "\nRope with a hook: To reach for places he can't reach and lift things.\n \n \n");
				Thread.sleep(1000);
				System.out.println("As the player receives the accessories he sets on his new adventure.");
				Thread.sleep(1000);

				System.out.println("Please check the map for further directions!! " + "\nType map for opening the map");
				
				String choice = "";
				do {
					choice = sc.next();
					numberOfMoves++;

					switch (choice) {
					case "map":
						System.out.println(choice);
						System.out.println(u.useMap("Level1"));
						j.start(numberOfMoves);
						break;
					case "gun":
						u.usedGun();
					case "knife":
						u.useKnife();
					case "rope":
						u.useRope();
					default:
						System.out.println("Continuing.. See map for further instructions..");
					}
				} while (!choice.equalsIgnoreCase("map"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
