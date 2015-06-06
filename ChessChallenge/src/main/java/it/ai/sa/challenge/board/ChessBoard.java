package it.ai.sa.challenge.board;

import it.ai.sa.challenge.piece.AbstractPiece;

import java.util.List;

public class ChessBoard
{
	private int row;
	private int columns;
	private int[][] possiblePiecesPositions;
	private List<AbstractPiece> pieces;
	
	public ChessBoard()
	{
		
		super();
	}
	public ChessBoard(int row, int columns, List<AbstractPiece> pieces)
	{
		super();
		this.row = row;
		this.columns = columns;
		this.pieces = pieces;
		possiblePiecesPositions = new int[row][columns]; 
	}
	public int[][] getPossiblePiecesPositions()
	{
		return possiblePiecesPositions;
	}
	public void setPossiblePiecesPositions(int[][] possiblePiecesPositions)
	{
		this.possiblePiecesPositions = possiblePiecesPositions;
	}
	public int getRow()
	{
		return row;
	}
	public void setRow(int row)
	{
		this.row = row;
	}
	public int getColumns()
	{
		return columns;
	}
	public void setColumns(int columns)
	{
		this.columns = columns;
	}
	public List<AbstractPiece> getPieces()
	{
		return pieces;
	}
	public void setPieces(List<AbstractPiece> pieces)
	{
		this.pieces = pieces;
	}

	
}
