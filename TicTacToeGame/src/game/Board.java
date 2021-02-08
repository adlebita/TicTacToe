package game;
import java.util.Arrays;

public class Board {

public Board() {
		
		newBoard();
		
	}
	
	public void newBoard(int row, int col) {}
	public void newBoard() {
		
		String[][] myboard = new String[3][3];
		
		myboard[0][0] = "1";
		myboard[0][1] = "2";
		myboard[0][2] = "3";
		myboard[1][0] = "4";
		myboard[1][1] = "5";
		myboard[1][2] = "6";
		myboard[2][0] = "7";
		myboard[2][1] = "8";
		myboard[2][2] = "9";
		
		for (int i = 0 ; i < myboard.length ; i++) {
			for (int x = 0 ; x < myboard.length ; x++) {
				if (x == 2) {
					System.out.println(myboard[i][x]);
				} else {
					System.out.print(myboard[i][x]);
				}
				
			}
		}
		
	
//		printBoard(myboard);
		
		
	}
	
//	public void printBoard(String[][] board) {
//		for (int row=0; row < board.length; row++) {
//			for (int col = 0; col<board[row].length; col++) {
//				
//				if(board[row][col].equals("")){
//					System.out.print(" ");
//				} else {
//					System.out.print(board[row][col]);
//				}
//				if(col<(board.length-1)) {
//					System.out.print("|");
//				}
//			}
//			System.out.print("\n------\n");
//		}
//	}
	
	
}
