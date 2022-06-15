import java.util.Scanner;
public class TicTacToe {
	private static char p1 = 'X';
	private static char p2 = 'O';
	public static String winner = "N/A";
	public static int moves = 0;
	
	private static char[][] board = {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}};
	public static void printBoard() {
		spacing();
		for(int i = 0; i <board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if (j != board[0].length-1) {
					System.out.print( " " + board[i][j] + " |");
				} else {
					System.out.println(" " + board[i][j]);
					
				}
				
				
			}
			if (i != board.length-1) {
				System.out.println("-----------");
			} 
			
		}
		
		
	}
	public static void printBoard(int delay) {
		
		for(int i = 0; i <board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				try        
				{
				    Thread.sleep(delay);
				    if (j != board[0].length-1) {
						System.out.print( " " + board[i][j] + " |");
					} else {
						System.out.println(" " + board[i][j]);
						
					}
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				
				
				
				
			}
			try        
			{
			    Thread.sleep(delay);
				if (i != board.length-1) {
					System.out.println("-----------");
				} 
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
		
			
		}
		
		
	} 
	public static void resetBoard() {
		for(int i = 0; i <board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				
				    board[i][j] = '-';
				
				
				
			}
		
			
		}
	}
	
	public static int getMove(int player) {
	
		String message = String.format("Player %d, pick a spot 1-9: ", player);
	
		try        
		{
		 
			
			for(int i = 0; i < message.length(); i++) {
				   Thread.sleep(50);
				System.out.print(message.substring(i,i+1));
			}

			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		    return -1;
		}
		
	}
	public static void editBoard(int player, int spot) {
		
		int row = (spot- 1)/3 ;
		int col = (spot-1)%3;
		if (board[row][col] == '-') {
			
		
		switch(player) {
		case 1:
			board[row][col] = p1;
			moves++;
			break;
		case 2: 
			board[row][col] = p2;
			moves++;
			break;
		}
		} 
		
	}
	
	public static void spacing() {
		System.out.println();
	}
	public static void spacing(int delay) {
		try        
		{
		    Thread.sleep(delay);
			System.out.println();
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	
	}
	public static int getPlayer(int index) {
		int player = (index%2+1);
	
		return player;
		
	}
	public static boolean checkRow() {
		char winning_char = ' ';
		boolean winning_row = false;
		for(int i = 0; i < board.length; i++) {
			
			winning_row = true;
		
			for(int j = 0; j < board[i].length-1; j++) {
				if(board[i][j] != board[i][j+1]) {
					winning_row = false;
				}
				
			}
			if(winning_row) {
				
				winning_char = board[i][0];
		
				if(winning_char != '-') {
					break;
				}
				
			}
			
		}
		winner = "" + winning_char;
		if(winning_char == '-') {
			return false;
		} else {
		return winning_row;
		}
		
	}
	public static boolean checkCol() {
		char winning_char = ' ';
		boolean winning_row = false;
		for(int j = 0; j < board[0].length; j++) {
			
			winning_row = true;
		
			for(int i = 0; i < board.length-1; i++) {
				if(board[i][j] != board[i+1][j]) {
					winning_row = false;
				}
				
			}
			if(winning_row) {
				
				winning_char = board[0][j];
		
				if(winning_char != '-') {
					break;
				}
				
			}
			
		}
		winner = "" + winning_char;
		if(winning_char == '-') {
			return false;
		} else {
		return winning_row;
		}
	
	}
	public static boolean checkDiagonalOne() {
		char winning_char = ' ';
		boolean winning_row = true;
		for(int j = 0; j < board.length-1; j++) {
			
			
		
		
				if(board[j][j] != board[j+1][j+1]) {
					winning_row = false;
					break;
				}
				
			
			if(winning_row) {
				
				winning_char = board[0][0];
		
				if(winning_char == '-') {
					winning_row = false;
				}
				
			}
			
		}
		winner = "" + winning_char;
		if(winning_char == '-') {
			return false;
		} else {
		return winning_row;
		}
	
	}
	public static boolean checkDiagonalTwo() {
		char winning_char = ' ';
		boolean winning_row = false;
		if(board[1][1] == board[2][0]) {
			if(board[1][1] == board[0][2]) {
				winning_row = true;
				
			} else {
				winning_row = false;
			}
			
			
		} else {
			winning_row = false;
			
		}
		
			
		if(winning_row) {
				
				winning_char = board[1][1];
		
				if(winning_char == '-') {
					winning_row = false;
				}
				
			}
			
		
		winner = "" + winning_char;
	
		return winning_row;
		
	
	}
	public static boolean dub() {
		return checkRow() || checkCol() || checkDiagonalOne() || checkDiagonalTwo();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printBoard(200);
		resetBoard();
		printBoard();
		int index = 0;
		
		while (!dub()) {
		spacing(750);
		editBoard(getPlayer(index), getMove(getPlayer(index)));
		printBoard();
		index++;
		
		}
		
		spacing();
		System.out.println(winner + " won the game in " + (moves+1)/2 + " moves");
		
		

	}

}
