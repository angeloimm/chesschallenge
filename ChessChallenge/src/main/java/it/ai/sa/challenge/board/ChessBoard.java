package it.ai.sa.challenge.board;

import it.ai.sa.challenge.piece.AbstractPiece;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard
{
	private int row;
	private int columns;
	private List<AbstractPiece> pieces;
	private List<ChessBoardPosition> possiblePiecesPositions;
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
		possiblePiecesPositions = new ArrayList<ChessBoardPosition>();
		for(int i = 0; i < row; i++)
		{
			for(int j= 0; j<columns; j++)
			{
				possiblePiecesPositions.add(new ChessBoardPosition((i+1), (j+1)));
			}
		}
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
	
	public List<ChessBoardPosition> getPossiblePiecesPositions()
	{
		return possiblePiecesPositions;
	}
	public void setPossiblePiecesPositions(List<ChessBoardPosition> possiblePiecesPositions)
	{
		this.possiblePiecesPositions = possiblePiecesPositions;
	}
	@Override
	public String toString()
	{
		return "ChessBoard [row=" + row + ", columns=" + columns + ", pieces=" + pieces + ", possiblePiecesPositions=" + possiblePiecesPositions + "]";
	}
}