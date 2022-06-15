import java.util.Scanner;

public class Game {
	public Game() {
		points = 100;
	}
	private int points;
	
	public int getPoints() {
		return points;
	}
	
	public void headsTails(int wager) {
		Scanner headScan = new Scanner(System.in);
		System.out.print("Heads or Tails? (H/T): ");
		String choice = headScan.nextLine();
		String correct = (((int) (Math.random()*2+1)) == 1) ? "H" : "T";
		
		System.out.println("The correct answer was " + correct);
		if (((correct.equals("H")) && (choice.equals("H") || choice.equals("Heads") || choice.equals("heads"))) || ((correct.equals("T")) && (choice.equals("T") || choice.equals("Tails") || choice.equals("tails")))){
			points += wager;
			
		} else {
			points -= wager;
		}
		
		
	}

}
