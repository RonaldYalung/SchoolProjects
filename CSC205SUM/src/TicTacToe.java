// This program sets up a TicTacToe board and allows two people
//  to play the game
// https://en.wikipedia.org/wiki/Tic-tac-toe

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class TicTacToe extends Board
{
  public static Scanner in;
  public static String turn;

  public static void main (String[]args)
  {
	// instantiate a new TicTacToe object to call the start method
	TicTacToe tictactoe = new TicTacToe ();
	  tictactoe.start ();
  }

  // need a non-static method to be able to implement the abstract class
  public void start ()
  {
	in = new Scanner (System.in);
	String playAgain = "y";
	String winner = "none";

	do
	  {
		Board board = new Board ();
		turn = "X";

		populateEmptyBoard ();

		System.out.println ("Welcome to Multi-Player Tic-Tac-Toe!!!");
		System.out.println ("--------------------------------------");

		super.printBoard ();

		System.out.println ();
		System.out.
		  println ("X plays first. Enter a space number to place X in:");

		do
		  {
			int numInput;

			try
			{
			  numInput = in.nextInt ();

			  if (!(numInput > 0 && numInput <= 9))
				{
				  System.out.println ("Error: Re-enter slot number:");
				  continue;
				}
			}
			catch (InputMismatchException e)
			{
			  System.out.
				println ("InputMismatchException: Re-enter slot number:");
			  in.nextLine ();
			  continue;
			}

			System.out.println ();
			if (board.board[0][0].equals (String.valueOf (numInput)))
			  {
				board.board[0][0] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[0][1].equals (String.valueOf (numInput)))
			  {
				board.board[0][1] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[0][2].equals (String.valueOf (numInput)))
			  {
				board.board[0][2] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[1][0].equals (String.valueOf (numInput)))
			  {
				board.board[1][0] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[1][1].equals (String.valueOf (numInput)))
			  {
				board.board[1][1] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[1][2].equals (String.valueOf (numInput)))
			  {
				board.board[1][2] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[2][0].equals (String.valueOf (numInput)))
			  {
				board.board[2][0] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[2][1].equals (String.valueOf (numInput)))
			  {
				board.board[2][1] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else if (board.board[2][2].equals (String.valueOf (numInput)))
			  {
			    board.board[2][2] = turn;
				checkTurn ();
                printBoard();
				winner = checkWinner ();
			  }
			else
			  {
				System.
				  out.println ("Slot already taken; re-enter slot number:");
				continue;
			  }


			System.out.println ();
			if (winner.equalsIgnoreCase ("draw"))
			  {
				System.out.println ("It's a draw! Thanks for playing.");
				System.out.println ();
			    System.out.println ("Play Again?");
			    playAgain = in.next ();
			  }
			else if (winner.equalsIgnoreCase ("x") || winner.equalsIgnoreCase ("o"))
			  {
				System.out.println ("Congratulations! " + winner +
									"'s have won! Thanks for playing.");
				System.out.println ();
			    System.out.println ("Play Again?");
			    playAgain = in.next ();
			  }

			
		  }	while (winner == "none");
		
	  }
	// keep looping until a winner is discovered or the game is a draw

	while (playAgain.equals ("y"));
  }



  // Change turn to the other player
  public void checkTurn ()
  {
	if (turn.equals ("X"))
	  {
		turn = "O";
	  }
	else
	  {
		turn = "X";
	  }
  }

  // determines if there is a winner of the current board
  public String checkWinner ()
  {
    String line = "1";
	for (int i = 0; i < 8; i++)
	  {


		// check each directional line of the board to see who wins - use ifs or switch
		if (board[0][0].equals ("X"))
		  {
			if (board[1][0].equals ("X"))
			  {
				if (board[2][0].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
			else if (board[0][1].equals ("X"))
			  {
				if (board[0][2].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
			else if (board[1][1].equals ("X"))
			  {
				if (board[2][2].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
		  }
		if (board[0][0].equals ("O"))
		  {
			if (board[1][0].equals ("O"))
			  {
				if (board[2][0].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
			else if (board[0][1].equals ("O"))
			  {
				if (board[0][2].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
			else if (board[1][1].equals ("O"))
			  {
				if (board[2][2].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
		  }
		if (board[0][2].equals ("X"))
		  {
			if (board[1][2].equals ("X"))
			  {
				if (board[2][2].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
			else if (board[1][1].equals ("X"))
			  {
				if (board[2][0].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
		  }
		if (board[0][2].equals ("O"))
		  {
			if (board[1][2].equals ("O"))
			  {
				if (board[2][2].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
			else if (board[1][1].equals ("O"))
			  {
				if (board[2][0].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
		  }
		if (board[1][1].equals ("X"))
		  {
			if (board[0][1].equals ("X"))
			  {
				if (board[2][1].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
			else if (board[1][0].equals ("X"))
			  {
				if (board[1][2].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
		  }
		if (board[1][1].equals ("O"))
		  {
			if (board[0][1].equals ("O"))
			  {
				if (board[2][1].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
			else if (board[1][0].equals ("O"))
			  {
				if (board[1][2].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
		  }
		if (board[2][2].equals ("X"))
		  {
			if (board[1][2].equals ("X"))
			  {
				if (board[0][2].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
			else if (board[2][1].equals ("X"))
			  {
				if (board[2][0].equals ("X"))
				  {
					line = "XXX";
				  }
			  }
		  }
		if (board[2][2].equals ("O"))
		  {
			if (board[1][2].equals ("O"))
			  {
				if (board[0][2].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
			else if (board[2][1].equals ("O"))
			  {
				if (board[2][0].equals ("O"))
				  {
					line = "OOO";
				  }
			  }
		  }
	  }


	// builds a String line representation to see if there is a winner
	if (line.equals ("XXX"))
	  {
		return "X";
	  }
	else if (line.equals ("OOO"))
	  {
		return "O";
	  }


	//double check that the board is full and leads to a draw
	for (int i = 0; i < 9; i++)
	  {
		if (Arrays.asList (board[0]).contains (String.valueOf (i + 1)))
		  {
			break;
		  }
		else if (Arrays.asList (board[1]).contains (String.valueOf (i + 1)))
		  {
			break;
		  }
		else if (Arrays.asList (board[2]).contains (String.valueOf (i + 1)))
		  {
			break;
		  }
		else if (i == 8)
		  {
			return "draw";
		  }
	  }

	System.out.println ();
	System.out.println (turn + "'s turn; Enter a space number to place " +
						turn + " in:");
	return "none";
  }

  // create the starting game board
  public static void populateEmptyBoard ()
  {
	for (int i = 0; i < 9; i++)
	  {
		if (i == 0)
		  {
			board[0][0] = String.valueOf (i + 1);
		  }
		else if (i == 1)
		  {
			board[0][1] = String.valueOf (i + 1);
		  }
		else if (i == 2)
		  {
			board[0][2] = String.valueOf (i + 1);
		  }
		else if (i == 3)
		  {
			board[1][0] = String.valueOf (i + 1);
		  }
		else if (i == 4)
		  {
			board[1][1] = String.valueOf (i + 1);
		  }
		else if (i == 5)
		  {
			board[1][2] = String.valueOf (i + 1);
		  }
		else if (i == 6)
		  {
			board[2][0] = String.valueOf (i + 1);
		  }
		else if (i == 7)
		  {
			board[2][1] = String.valueOf (i + 1);
		  }
		else if (i == 8)
		  {
			board[2][2] = String.valueOf (i + 1);
		  }
	  }
  }
}


// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. such as Course
// Hero and/or Chegg. Tracking information is embedded into the assignment files and
// any person found to be distributing files may be prosecuted. This includes
// notification to the college, any discipline it warrants and legal action if
// it is warranted.
