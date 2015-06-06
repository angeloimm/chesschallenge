package it.ai.sa.challenge.piece;

public abstract class AbstractPiece
{
	private String name;
	private PieceTypeEnum pieceType;
	private int[][] piecePosition;
	
	public AbstractPiece(String name, PieceTypeEnum pieceType)
	{
		super();
		this.name = name;
		this.pieceType = pieceType;
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
	
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pieceType == null) ? 0 : pieceType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPiece other = (AbstractPiece) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pieceType != other.pieceType)
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "AbstractPiece [name=" + name + ", pieceType=" + pieceType + "]";
	}
}
