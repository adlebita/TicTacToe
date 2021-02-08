package game;
import java.util.Arrays;

public class Board {

public Board() {
		
		newBoard();
		
	}
	
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
		
			for (int row = 0 ; row < myboard.length ; row++) {
				
					for (int column = 0 ; column < myboard.length ; column++) {
						if (column == 2) {
							System.out.println(myboard[row][column]);
						if (row == 0 || row == 1) {
							System.out.println("-+-+-");
							}
						} else {
							System.out.print(myboard[row][column] + "|");
						}
					
					}
			}
		
		}
}