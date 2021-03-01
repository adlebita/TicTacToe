package game;
import java.util.*;

public class Board {

	
Scanner myScanner = new Scanner(System.in);
String [][] myBoard;
int count = 1;
int playerRow;
int playerColumn;
	
public Board() {
		System.out.println("Player 1 is crosses X, and player 2 is noughts O.");
		System.out.println("Start Tic Tac Toe by crosses making first move.");
		System.out.println("To place marker, type row number first then column number.");
		playerMove();
		markerPlacement(this.playerRow, this.playerColumn);
		
		newBoard();
		checkBoard();
		
		
	}
	
		public String[][] newBoard() {
		
		String[][] myBoard = new String[3][3];
		
		myBoard[0][0] = "";
		myBoard[0][1] = "";
		myBoard[0][2] = "";
		myBoard[1][0] = "";
		myBoard[1][1] = "";
		myBoard[1][2] = "";
		myBoard[2][0] = "";
		myBoard[2][1] = "";
		myBoard[2][2] = "";
		
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
		
		public int playerMove() {
		
			int playerRow = myScanner.nextInt();
			int playerColumn = myScanner.nextInt();
			
			this.playerRow = playerRow;
			this.playerColumn = playerColumn;
			
			return this.playerRow + this.playerColumn;
		}
		
		public int markerPlacement(int row, int column) {
			if(count % 1 == 0) {
				myBoard[row][column] = "X";
			}
			
			if(count % 2 == 0) {
				myBoard[row][column] = "O";
			}
			
			return this.count = count++;
		}
}