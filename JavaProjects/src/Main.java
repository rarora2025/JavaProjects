import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		boolean playing = true;
		
		while (playing) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Wager: ");
		int wager = scan.nextInt();
		boolean valid_wager = false;
		while (valid_wager == false) {
			if (wager <= game.getPoints()) {
				
				valid_wager = true;
				
			} else {
				
				System.out.print("Please enter a valid wager: ");
				wager = scan.nextInt();
				
			}
		} 
		
		
		game.headsTails(wager);
		System.out.println("Points: " + game.getPoints());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Play Again? (Y/N) ");
		if (scanner.nextLine().equals("N")) {
			System.out.println("GAME OVER, You ended with " + game.getPoints());
			playing = false;
		}
		}
	}

}
