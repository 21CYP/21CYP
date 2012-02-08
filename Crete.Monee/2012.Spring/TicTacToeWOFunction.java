import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeWOFunction {

	public static void main(String[] args) {
		
		int player = 1;
		boolean winning = false;
		
		int [][] board = new int [3][3];
		
		for (int rows=0; rows< 3; rows++)
		{			
			for (int cols=0; cols < 3; cols++)
			{
				board[rows][cols] = 0;
			}
		}
		System.out.println("A new board is ready.");
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
	
		do
		{
			InputStreamReader istream = new InputStreamReader(System.in) ;
			BufferedReader bufRead = new BufferedReader(istream) ;
			int RowInput, ColInput, gridValue;
			RowInput = 0;
			ColInput = 0;
			gridValue = 0;
			System.out.println("=== NEW TURN ===");
			
			do {
		        if (player == 1)
		        {
		        	System.out.println("Player 1, please enter your choice:");
		        }
		        else
		        {
		        	System.out.println("Player 2, please enter your choice:");
		        }
				
				try {
		            System.out.println("Enter Row: ");
		            String numInput = bufRead.readLine();
		            RowInput = Integer.parseInt(numInput);
		            RowInput = RowInput -1;
		            
		            System.out.println("Enter Column: ");
		            numInput = bufRead.readLine();
		            ColInput = Integer.parseInt(numInput);
		            ColInput = ColInput -1;
		            
		       		}
		        catch (IOException err) {
		        	System.out.println("Error reading line");
		       		}
		        catch(NumberFormatException err) {
		           System.out.println("Error Converting Number");
		        }
				gridValue = board[RowInput][ColInput];
				
				if (gridValue != 0)
				{
					System.out.println("That position is already taken. Please re-enter a new position.");
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
				
			} while (gridValue != 0); 
			// TODO -- Overwrite Check
		
			if (player == 1)
			{
				board[RowInput][ColInput] = 1;
				player = 2;
			}
			else
			{
				board[RowInput][ColInput] = -1;
				player = 1;
			}
			
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
		}while (winning != true);
		
		System.out.println("Game is over.");
	}
}
