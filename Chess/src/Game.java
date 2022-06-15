
public class Game {
	static Piece[][] board = new Piece[8][8];
	public static void main(String[] args) {
		
		
		board[0][0] = new Rook(false,0,0);
		board[0][1] = new Knight(false, 0,1);
		board[0][2] = new Bishop(false, 0,2);
		board[0][3] = new Queen(false, 0, 3);
		board[0][4] = new King(false, 0, 4);
		board[0][5] = new Bishop(false, 0,5);
		board[0][6] = new Knight(false, 0,6);
		board[0][7] = new Rook(false, 0,7);
		printBoard();
		
		
	}
	
	public static void printBoard() {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print("| " + board[i][j] + " | ");

				
			}
			System.out.println("\n- - - - - - - -");
		}
		
	}

}
