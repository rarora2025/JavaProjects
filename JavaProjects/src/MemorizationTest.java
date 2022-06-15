import java.io.IOException;
import java.util.Scanner;
public class MemorizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
//		System.out.println("(1): Numbers");
//		System.out.println("(2): Letters");
//		System.out.println("(3): Words");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Select a Game Mode: ");
//		int x = 0;
//		switch(scan.nextInt()) {
//		
//		case 1:
//			x = numGame();
//			break;
//		case 2:
//			x = charGame();
//			break;
//		case 3:
//			x = strGame();
//			break;
//			
//		
//		}
		
		boolean play = true;
		
		
		do {
		int x = numGame();
		Scanner scan = new Scanner(System.in);
		System.out.println("You scored " + x);
		System.out.print("Play Again? (Y/N) ");
		String response = scan.nextLine();
		
		play = response.equals("Y") || response.equals("y") ? true : false;
		}while(play);
		
		System.out.println("You probably got 7...want to know how I knew? (Y/N)");
		Scanner scanny = new Scanner(System.in);
		String response3 = scanny.nextLine();
		boolean funfact = response3.equals("Y") || response3.equals("y") ? true : false;
		
		if(funfact) {
		String Command="open "+"http://abcnews.go.com/Technology/brain-memory-magic-number/story?id=9189664a";
		try {
			Process Child=Runtime.getRuntime().exec(Command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}
	
	public static int numGame() {
		int score = 0;
		Scanner n = new Scanner(System.in);
		boolean stillPlaying = true;
		
		String code = "";
		while(stillPlaying) {
			code += (int) (Math.random()*10);
			for(int x = 0; x< code.length(); x++) {
				for (int j = 0; j < 999; j++) {
					System.out.println();
					
				}
				System.out.print(code.charAt(x));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int j = 0; j < 999; j++) {
					System.out.println();
					
				}
				
			}
			System.out.println();
			System.out.print("Enter the Code you Recall: ");
			String no = n.nextLine();
			if(no.equals(code)) {
				score++;
				
			} else {
				int letters_off = 0;
				
				int shorter_length = no.length() > code.length() ? no.length() : code.length();
for(int z = 0; z<shorter_length; z++) {
	if(code.charAt(z) != no.charAt(z)) {
		letters_off +=1;
	}
					
				}
				System.out.println("Sorry to break it to you, but the code was actually " + code + ". You were " + letters_off + " letters off.");
				
				
				stillPlaying = false;
			}
			
			
		}
		
		return score;
		
	}
	public static int strGame() {
		return 0;
		
	}

	public static int charGame() {
		return 0;
		
	}


}
