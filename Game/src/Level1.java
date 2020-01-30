import java.util.*;
import java.lang.*;

public class Level1 {

	String in = "";
	Scanner sc = new Scanner(System.in);
	Jungle j = new Jungle();

	public Level1() {

		try {

			System.out.println("Player is on his way to College and walking towards the station.."
					+ "\n His mind wanders off thinking of what to write for his paper for writing an adventure story for his arts class. "
					+ "\n Wind gushes in.. an old crumbled paper flews past the guy in front of him and sticks on his face."
					+ "He takes a look at the paper and he sees a map and there is an address inscribed on its back. \n"
					+ "TO ONLY THE MAN WITH HEART, COMES THE GREAT TREASURE. \n"
					+ "Excited the player wants to go pursue the adventure. So he goes to the mentioned address"
					+ "There he finds a box. He sees that the key to open a box is a combination of letters in order.\n"
					+ "Find the right keyword and you may open the box");
			Thread.sleep(2000);
			
			System.out.println("A,k,T,E \n" + "E,M \n" + "H,M,E,O");

			in = sc.nextLine();
			while (!in.toLowerCase().trim().equalsIgnoreCase("take me home")) {
				System.out.println("Enter a valid input");
				in = sc.nextLine();
			}

			startJourney();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startJourney() {

		try {
			System.out.println(
					"He opens the box he finds a Totem.\nScreen flashes and he vanishes and enters a magical world.\n"
							+ "The totem comes to life and tells player that he needs to return him to his resting place in order to lift the curse on him."
							+ "Player thinks this could give him very good content for his paper. \n"
							+ "Do you want to play along ?");

			in = sc.next();
			while (!in.toLowerCase().equalsIgnoreCase("yes") && !in.toLowerCase().equalsIgnoreCase("no")) {
				System.out.println("Enter a valid input");
				in = sc.next();
			}
			if (in.equalsIgnoreCase("no")) {
				sc.close();
				System.out.println("sorry.. you need to leave");
			} else {
				Thread.sleep(2000);
				System.out.println(
						"Totem: Hi Player.. My name is alicia. Please take these items which will help you in your journey.\n \n");
				Thread.sleep(1500);
				System.out.println(
						"Player: Alicia hands over a\n Map: To navigate to the destination present deep inside the mountains."
								+ "\n Torch: to see places where its dark"
								+ "\n Revolver: To protect himself. It contains only 6 rounds. Use them wisely and when absolutely necessary."
								+ "\n Knife: To use as melee weapon."
								+ "\n Rope with a hook: To reach for places he can't reach and lift things.");
				Thread.sleep(1500);
				System.out.println("\n \n \n As the player receives the accessories he sets on his new adventure.");
				Thread.sleep(2000);
				System.out.println("********************Level I**************** \n"
						+ "Welcome to the Jungle ");
				Thread.sleep(1000);
				

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
