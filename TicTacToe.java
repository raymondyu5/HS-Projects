Enable desktop notifications for Gmail.
   OK  No thanks
Meet
New meeting
Join a meeting
Hangouts

4 of 131
Files from school laptop
Inbox

Raymond Yu <datraytho@gmail.com>
Attachments
Jun 17, 2022, 7:49 AM
to me


7 Attachments

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
		List lowRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List leftDiaCol = Arrays.asList(1,5,9);
		List rightDiaCol = Arrays.asList(3,5,7);
		
		List<List> winCheck = new ArrayList<List>();
		winCheck.add(topRow);
		winCheck.add(midRow);
		winCheck.add(lowRow);
		winCheck.add(leftCol);
		winCheck.add(midCol);
		winCheck.add(rightCol);
		winCheck.add(leftDiaCol);
		winCheck.add(rightDiaCol);
		for(List k : winCheck) {
			if(positions.containsAll(k)) {
				return "GG! You won!";
			} else if(computerPositions.containsAll(k)) {
				return "Better Luck Next Time!";
			}else if(positions.size()+ computerPositions.size() == 9) {
				return "Its a tie! Wow your good man, let's play again!";
			}
		}
		return "";
	}
		
//sets each piece X or O
	public static void setPiece(String player, char[][] board, int position) {
		char defaultSymbol = ' ';
		if(player.equals("player")) {
			defaultSymbol = 'X';
			positions.add(position);
		}else if(player.equals("computer")) {
			defaultSymbol = 'O';
			computerPositions.add(position);
		}
		switch(position) {
			case 1: 
				board[0][0] = defaultSymbol;
				break;	
			case 2: 
				board[0][2] = defaultSymbol;
				break;
			case 3: 
				board[0][4] = defaultSymbol;
				break;
			case 4: 
				board[2][0] = defaultSymbol;
				break;
			case 5: 
				board[2][2] = defaultSymbol;
				break;	
			case 6: 
				board[2][4] = defaultSymbol;
				break;
			case 7: 
				board[4][0] = defaultSymbol;
				break;
			case 8: 
				board[4][2] = defaultSymbol;
				break;	
			case 9: 
				board[4][4] = defaultSymbol;
				break;
			default:
				break;

						
		}
	}
}