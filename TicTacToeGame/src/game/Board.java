package game;
import java.util.Arrays;

public class Board {

String [][] myBoard;	
	
public Board() {
		
		newBoard();
		
	}
	
		public String[][] newBoard() {
		
		String[][] myBoard = new String[3][3];
		
		myBoard[0][0] = "1";
		myBoard[0][1] = "2";
		myBoard[0][2] = "3";
		myBoard[1][0] = "4";
		myBoard[1][1] = "1";
		myBoard[1][2] = "6";
		myBoard[2][0] = "7";
		myBoard[2][1] = "8";
		myBoard[2][2] = "1";
		
			for (int row = 0 ; row < myBoard.length ; row++) {
				
					for (int column = 0 ; column < myBoard.length ; column++) {
						if (column == 2) {
							System.out.println(myBoard[row][column]);
						if (row == 0 || row == 1) {
							System.out.println("-+-+-");
							}
						} else {
							System.out.print(myBoard[row][column] + "|");
						}
					
					}
			}
		
		return this.myBoard = myBoard;
		
		}
		
		public boolean checkBoard() {
			// check row matches
		if(myBoard[0][0] == myBoard[0][1] && myBoard[0][1] == myBoard[0][2]) {
				return true;
			} else if(myBoard[1][0] == myBoard[1][1] && myBoard[1][1] == myBoard[1][2]) {
				return true;
			} else if(myBoard[2][0] == myBoard[2][1] && myBoard[2][1] == myBoard[2][2]) {
				return true;
			// check column matches
			} else if(myBoard[0][0] == myBoard[1][0] && myBoard[1][0] == myBoard[2][0]) {
				return true;
			} else if(myBoard[0][1] == myBoard[1][1] && myBoard[1][1] == myBoard[2][1]) {
				return true;
			} else if(myBoard[0][2] == myBoard[1][2] && myBoard[1][2] == myBoard[2][2]) {
				return true;
			// check diagonal matches
			} else if(myBoard[0][0] == myBoard[1][1] && myBoard[1][1] == myBoard[2][2]) {
				return true;
			} else if(myBoard[0][2] == myBoard[1][1] && myBoard[1][1] == myBoard[2][0]);
		
			return false;
		}
		
}