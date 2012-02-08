import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

	// Define variables globally.  Remember  -- Define first > Assign next > Code.
	static int player = 1;					// Use this to keep track of players
	static boolean winning = false;			// Use this to check if someone won the game.
	static int [][] board = new int [3][3]; // Define the board
	
	public static void main(String[] args) {
		
		/*
		 * When we play the game, we start with a completely new board.
		 * Then we have to show the board for the first time.
		 * We will now loop thru the game and ask for rows and col for each player until someone wins.
		 */
		
		InitializeBoard();					// Function call (AKA Method) to make a new board and assign 0s to all the board
		ShowBoard();						// Function call to show the board
		do									// Loop Starts
		{
			playMove();						// Let the player (1) or (2) play 
			checkWinner();					// Check For Winner
			ShowBoard();					// Show result
		}while (winning != true);			// Loop repeats until someone wins.
		
		System.out.println("Game is over.");
		
	}
	

	private static void playMove() {
		InputStreamReader istream = new InputStreamReader(System.in) ; 	// Input stream is needed to read in from keyboard
		BufferedReader bufRead = new BufferedReader(istream) ;			// We read value into buffered reader of the input stream
		int RowInput, ColInput, gridValue;
		RowInput = 0;
		ColInput = 0;
		gridValue = 0;
		System.out.println("=== NEW TURN ===");
		
		do {															// Notice that we have a loop here... What is this loop for?
	        if (player == 1)											// Check to see who is playing this round
	        {
	        	System.out.println("Player 1, please enter your choice:");
	        }
	        else
	        {
	        	System.out.println("Player 2, please enter your choice:");
	        }
			
			try {														// Read in Row Col info
	            System.out.println("Enter Row: ");
	            String numInput = bufRead.readLine();
	            RowInput = Integer.parseInt(numInput);					// convert the string that we read to integer
	            RowInput = RowInput -1;									// since arrays start at 0 and not 1, we reduce the figure by 1
	            
	            System.out.println("Enter Column: ");
	            numInput = bufRead.readLine();
	            ColInput = Integer.parseInt(numInput);
	            ColInput = ColInput -1;
	            
	       		}
	        catch (IOException err) {									// incase something goes wring with read buffer
	        	System.out.println("Error reading line");
	       		}
	        catch(NumberFormatException err) {							// incase we have issues reading in numbers
	           System.out.println("Error Converting Number");
	        }
																		// Check to see if the the board position is taken
			gridValue = board[RowInput][ColInput];						// Read the value of the current position
			if (gridValue != 0)											
			{
				System.out.println("That position is already taken. Please re-enter a new position.");
				ShowBoard();
			}
			
		} while (gridValue != 0); 										// Ahh... The loop is there to make sure that we are not replacing played areas
	
		if (player == 1)												// Now put the pieces on the grid.
		{
			board[RowInput][ColInput] = 1;
			player = 2;
		}
		else
		{
			board[RowInput][ColInput] = -1;
			player = 1;
		}
	}
	
	private static void checkWinner() {									// Winning logic
		winning = false;
		int R1, R2, R3, C1, C2, C3, X1, X2, SUM;
		String SortString, DrawCondition;

		DrawCondition = "0";
		
		R1 =  board[0][0] +  board[0][1] +  board[0][2];
		R2 =  board[1][0] +  board[1][1] +  board[1][2];
		R3 =  board[2][0] +  board[2][1] +  board[2][2];
		C1 =  board[0][0] +  board[1][0] +  board[2][0];
		C2 =  board[0][1] +  board[1][1] +  board[2][1];
		C3 =  board[0][2] +  board[1][2] +  board[2][2];
		X1 =  board[0][0] +  board[1][1] +  board[2][2];
		X2 =  board[2][0] +  board[1][1] +  board[0][2];
		
		SortString = ","+ R1 + "," + R2 + "," + R3 + "," + C1 + "," + C2 + "," + C3 + "," + X1 + "," + X2+ ",";
		
		System.out.println();
        int index1 = SortString.indexOf(DrawCondition);
		
        if (R1 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (R1 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (R2 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (R2 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (R3 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (R3 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (C1 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (C1 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (C2 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (C2 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (C3 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (C3 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (X1 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (X1 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (X2 == 3) {
        	System.out.println("Player 1 has won the game!");
        	winning = true;
        } else if (X2 == -3) {
        	System.out.println("Player 2 has won the game!");
        	winning = true;
        } else if (index1 == -1)
        {
        	System.out.println("The game ended in a tie!");
            winning = true;
        }
	}
	
		
	private static void InitializeBoard() {											// Give us a clean board
		for (int rows=0; rows< 3; rows++)
		{			
			for (int cols=0; cols < 3; cols++)
			{
				board[rows][cols] = 0;
			}
		}
		System.out.println("A new board is ready.");
	}

	private static void ShowBoard() {												// Print out the board
		System.out.println("Board currently looks like this:");
		System.out.println ("   1  2  3");
		for (int rows=0; rows< 3; rows++)
		{
			System.out.print ((rows+1) + " ");
			
			for (int cols=0; cols < 3; cols++)
			{
				String piece = Integer.toString(board[rows][cols]);
				if (piece.length()<2)
				{
					System.out.print( " "+board[rows][cols] + " ");
				}
				else
				{
					System.out.print( board[rows][cols] + " ");
				}
			}
			System.out.println("\n");
		}
	}
}
