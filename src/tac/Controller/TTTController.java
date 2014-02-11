package tac.Controller;

import tic.Model.TicTacToe;

public class TTTController
{

	private TicTacToe funGame;

	public TTTController()
	{

		funGame = new TicTacToe();

	}

	public void start()
	{

		new TicTacToe();
	}

	public TicTacToe getFunGame()
	{

		return funGame;
	}
}