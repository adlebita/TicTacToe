package game;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to NOUGHTS & CROSSES");
		System.out.println("To begin please enter a location. Crosses go first.");
		Board tictactoe  = new Board();
		tictactoe.playBoard();
		sc.close();
	}

}
