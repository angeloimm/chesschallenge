package it.ai.sa.challenge.piece;

public abstract class AbstractPiece
{
	private String name;
	private PieceTypeEnum pieceType;
	private int[][] piecePosition;
	
	public AbstractPiece(String name, PieceTypeEnum pieceType, int[][] piecePosition)
	{
		super();
		this.name = name;
		this.pieceType = pieceType;
		this.piecePosition = piecePosition;
	}
	public AbstractPiece()
	{
		super();
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public PieceTypeEnum getPieceType()
	{
		return pieceType;
	}
	public void setPieceType(PieceTypeEnum pieceType)
	{
		this.pieceType = pieceType;
	}
	public int[][] getPiecePosition()
	{
		return piecePosition;
	}
	public void setPiecePosition(int[][] piecePosition)
	{
		this.piecePosition = piecePosition;
	}
}
