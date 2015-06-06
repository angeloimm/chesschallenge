package it.ai.sa.challenge.board;

import it.ai.sa.challenge.piece.AbstractPiece;

public class ChessBoardPosition
{
	private int row;
	private int column;
	public ChessBoardPosition(int row, int column)
	{
		super();
		this.row = row;
		this.column = column;
	}
	public int getRow()
	{
		return row;
	}
	public void setRow(int row)
	{
		this.row = row;
	}
	public int getColumn()
	{
		return column;
	}
	public void setColumn(int column)
	{
		this.column = column;
	}
	@Override
	public String toString()
	{
		return "ChessBoardPosition [row=" + row + ", column=" + column + "]";
	}
}
