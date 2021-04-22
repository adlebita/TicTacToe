package game;
import java.util.*;

public class Board {

	Scanner myScanner = new Scanner(System.in);
	String playerCoordinate;
	int playerRow;
	int playerColumn;
	boolean inputValidation = false;
	boolean playerTurn = true;
	String[][] myBoard = new String[3][3];
	
	public void playBoard() {
		setBoard();
		printBoard();
		do{
			playGame();	
		} while (!checkBoard());
	}	
	
	public String[][] setBoard(){
		
		myBoard[0][0] = "1";
		myBoard[0][1] = "2";
		myBoard[0][2] = "3";
		myBoard[1][0] = "4";
		myBoard[1][1] = "5";
		myBoard[1][2] = "6";
		myBoard[2][0] = "7";
		myBoard[2][1] = "8";
		myBoard[2][2] = "9";
		
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

	
	public void playerLocation() {
		System.out.println("Please enter a location");
		playerCoordinate = myScanner.nextLine();
	}
	
	public void inputValidation() {
//		if (playerCoordinate > 0 && playerCoordinate < 10) {
			switch(playerCoordinate) {
			case "1":
				playerRow = 0;
				playerColumn = 0;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "2":
				playerRow = 0;
				playerColumn = 1;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "3":
				playerRow = 0;
				playerColumn = 2;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "4":
				playerRow = 1;
				playerColumn = 0;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "5":
				playerRow = 1;
				playerColumn = 1;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "6":
				playerRow = 1;
				playerColumn = 2;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "7":
				playerRow = 2;
				playerColumn = 0;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "8":
				playerRow = 2;
				playerColumn = 1;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			case "9":
				playerRow = 2;
				playerColumn = 2;
				inputValidation = markerCheck(playerRow, playerColumn);
				break;
			default:
				System.out.println("Try again.");
				break;
			}
	
	}
	
	
	
	public boolean markerCheck(int row, int column) {

		if(myBoard[playerRow][playerColumn] == "X" || myBoard[playerRow][column] == "O") {
			System.out.println("That spot is taken. Please choose another location");
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
	
	public void placeMarker() {
		if(playerTurn) {
			myBoard[playerRow][playerColumn] = "X";
			playerTurn = false;
		} else {
			myBoard[playerRow][playerColumn] = "O";
			playerTurn = true;
		}
	}

	public void playGame() {
	do {
		playerLocation();
		inputValidation();
	} while (!inputValidation);
		placeMarker();
		checkBoard();
		printBoard();
	}
	
	
}