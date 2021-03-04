package game;
import java.util.*;

public class Board {

	Scanner myScanner = new Scanner(System.in);
	int count = 1;
	int playerRow;
	int playerColumn;
	String[][] myBoard = new String[3][3];
	
	public void playBoard() {
		setBoard();
		printBoard();
		playGame();	
	}	
	
	public String[][] setBoard(){
		
		myBoard[0][0] = " ";
		myBoard[0][1] = " ";
		myBoard[0][2] = " ";
		myBoard[1][0] = " ";
		myBoard[1][1] = " ";
		myBoard[1][2] = " ";
		myBoard[2][0] = " ";
		myBoard[2][1] = " ";
		myBoard[2][2] = " ";
		
		return this.myBoard;
	}
	
	public String[][] printBoard() {
		
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
		return myBoard;
	}
			
	public int playerMove() {
	
		String playerCoordinate = myScanner.nextLine();
					
		char[] value = playerCoordinate.toCharArray();
		
		int playerRow = Character.getNumericValue(value[0]);
		int playerColumn = Character.getNumericValue(value[1]);
			
		this.playerRow = playerRow; 
		this.playerColumn = playerColumn;
		return this.playerRow + this.playerColumn;
	}
	
	public boolean markerPlacement(int row, int column) {

		if(myBoard[playerRow][playerColumn] == "X" || myBoard[playerRow][column] == "O") {
			System.out.println("Please enter another location");
			return false;
		}
		return true;
	}			

	public boolean checkBoard() {
	if (myBoard[playerRow][playerColumn] == "X" || myBoard[playerRow][playerColumn] == "O") {	
				// check row matches
		if(myBoard[playerRow][playerColumn] == myBoard[0][0] && myBoard[0][0] == myBoard[0][1] && myBoard[0][1] == myBoard[0][2]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			} else if(myBoard[playerRow][playerColumn] == myBoard[1][0] && myBoard[1][0] == myBoard[1][1] && myBoard[1][1] == myBoard[1][2]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			} else if(myBoard[playerRow][playerColumn] == myBoard[2][0] && myBoard[2][0] == myBoard[2][1] & myBoard[2][1] == myBoard[2][2]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			// check column matches
			} else if(myBoard[playerRow][playerColumn] == myBoard[0][0] && myBoard[0][0] == myBoard[1][0] && myBoard[1][0] == myBoard[2][0]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			} else if(myBoard[playerRow][playerColumn] == myBoard[0][1] && myBoard[0][1] == myBoard[1][1] && myBoard[1][1] == myBoard[2][1]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			} else if(myBoard[playerRow][playerColumn] == myBoard[0][2] && myBoard[0][2] == myBoard[1][2] && myBoard[1][2] == myBoard[2][2]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			// check diagonal matches
			} else if(myBoard[playerRow][playerColumn] == myBoard[1][1] && myBoard[1][1] == myBoard[2][2] && myBoard[2][2] == myBoard[0][0]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			} else if(myBoard[playerRow][playerColumn] == myBoard[1][1] && myBoard[1][1] == myBoard[2][0] && myBoard[2][0] == myBoard[0][2]) {
				System.out.println(myBoard[playerRow][playerColumn] + "'s wins!");
				return true;
			}
	}
		return false;
	}

	public void playGame() {
	while(checkBoard() == false) {
	//	System.out.println("Enter coordinates");
		do {
		playerMove();
		} while(markerPlacement(playerRow, playerColumn) == false);
		if(count % 2 == 0) {
			count++;
			System.out.println("CROSSES turn... Enter a location");
			myBoard[playerRow][playerColumn] = "O";
		} else {
			count++;
			System.out.println("NOUGHTS turn... Enter a location");
			myBoard[playerRow][playerColumn] = "X";
		}
		checkBoard();
		printBoard();
		}
	}
}