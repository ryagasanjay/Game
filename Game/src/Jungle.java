import java.util.Scanner;

public class Jungle {
	private int move;
	public final String x = "left right up down";
	// String[] count= {};
	Scanner sc = new Scanner(System.in);

	public void start() throws Exception {
		findpattern();
		String path = followPath();
		
		if(path.equalsIgnoreCase("down down right right") || path.equalsIgnoreCase("down right down right")) {
			Thread.sleep(2000);
			System.out.println("CONGRATULATIONS..!!"
					+ "\nYOU HAVE CLEARED YOUR FIRST OBSTACLE IN THIS ADVENTURE.\n\n BOY YOU'RE VERY SMART.. :P");
			System.out.println("********************Level I**************** \n" + "Welcome to the Jungle ");
			Thread.sleep(1000);
		}
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
			pattern = sc.nextLine();
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
			}
			System.out.println();
		}
	}

}
