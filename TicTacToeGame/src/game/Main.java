package game;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to NOUGHTS & CROSSES");
		System.out.println("Crosses go first.");
		Board tictactoe  = new Board();
		tictactoe.playBoard();
	}
}
