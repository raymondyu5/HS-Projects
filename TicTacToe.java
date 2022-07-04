import java.util.Arrays;
import java.util.*;

public class Board {
	
	static ArrayList<Integer> positions = new ArrayList<Integer>();
	static ArrayList<Integer> computerPositions = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		char[][] board = {{' ','|',' ','|',' '},
				  {'-', '+','-','+', '-'},
				  {' ', '|',' ','|', ' '},
				  {'-', '+','-','+', '-'},
				  {' ','|',' ','|',' '}};	
		printBoard(board);
		
//makes it so the computer is always waiting for your turn
//Lets you place your turn
//game loop
		while(true) {
			Scanner user = new Scanner(System.in);
			System.out.println("Enter your placement (1-9):");
			int position = user.nextInt();		
//to stop from replacing over placements that have already been placed
			while(positions.contains(position) || computerPositions.contains(position)) {
				System.out.println("Hey dude. That place is already taken. Try Again!");
				position = user.nextInt();
			}
			
			setPiece("player", board, position);
			String win = checkWin();
			if(win.length() > 0) {
				System.out.println(win);
				break;
			}
			Random rand = new Random();
			int computerPosition = rand.nextInt(9) + 1;
//doesn't let computer take your positions
			while(positions.contains(computerPosition) || computerPositions.contains(computerPosition)) {
				computerPosition = rand.nextInt(9) + 1;
			}
			setPiece("computer", board, computerPosition);
			printBoard(board);
			
			win = checkWin();
			if(win.length() > 0) {
				System.out.println(win);
				break;
			}
		}
			
		
		
	}
	
//prints board
	public static void printBoard(char[][] board) {
		for(char[] k : board) {
			for(char c : k) {
				System.out.print(c);
		}
			System.out.println();
		}
	}
//checks win
	public static String checkWin() {
		
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List lowRow = Arrays.asList(7,
