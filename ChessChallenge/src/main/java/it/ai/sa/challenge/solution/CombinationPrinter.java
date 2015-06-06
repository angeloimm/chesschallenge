package it.ai.sa.challenge.solution;

import it.ai.sa.challenge.board.ChessBoard;
import it.ai.sa.challenge.piece.AbstractPiece;
import it.ai.sa.challenge.piece.Bishop;
import it.ai.sa.challenge.piece.King;
import it.ai.sa.challenge.piece.Knight;
import it.ai.sa.challenge.piece.PieceTypeEnum;
import it.ai.sa.challenge.piece.Queen;
import it.ai.sa.challenge.piece.Rook;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinationPrinter
{
	private static final Logger logger = LoggerFactory.getLogger(CombinationPrinter.class.getName());
	public void printUniqueCombination(int boardRow, int boardColumns, int kingNumber, int queenNumber, int bishopNumber, int rookNumber, int knightNumber)
	{
		if( boardRow <= 0 )
		{
			throw new IllegalArgumentException("Impossible create a chess board with 0 or less rows");
		}
		if( boardColumns <= 0 )
		{
			throw new IllegalArgumentException("Impossible create a chess board with 0 or less columns");
		}
		if( logger.isInfoEnabled() )
		{
			logger.info("Trying to print unique combinations for chessboard "+boardRow+"*"+boardColumns+" and with "+kingNumber+" Kings, "+queenNumber+" Queens, "+bishopNumber+" Bishops, "+rookNumber+" Rooks and "+knightNumber+" Knights");
		}
		long startTime = System.currentTimeMillis();
		int uniqueCombinationsNumber = 0;
		try
		{
			int maxPiecesNumber = boardRow*boardColumns;
			int totalPiecesOnBoard = kingNumber + queenNumber + bishopNumber + rookNumber + knightNumber;
			if( totalPiecesOnBoard > maxPiecesNumber )
			{
				throw new IllegalArgumentException("Too many pieces for the chess board. Max pieces allowed: "+maxPiecesNumber+". Total pieces "+totalPiecesOnBoard);
			}
			boolean goOn = true;
			if( kingNumber == 0 && queenNumber == 0 && bishopNumber == 0 && rookNumber == 0 && knightNumber == 0 )
			{
				if( logger.isWarnEnabled() )
				{
					logger.warn("No piece on board; no combination to print");
				}
				goOn = false;
			}
			if( goOn )
			{
				List<AbstractPiece> boardPieces = new ArrayList<AbstractPiece>(totalPiecesOnBoard);
				if( kingNumber > 0 )
				{
					boardPieces.addAll(this.createBoardPieces(kingNumber, PieceTypeEnum.KING));
				}
				if( queenNumber > 0 )
				{
					boardPieces.addAll(this.createBoardPieces(queenNumber, PieceTypeEnum.QUEEN));
				}
				if( bishopNumber > 0 )
				{
					boardPieces.addAll(this.createBoardPieces(bishopNumber, PieceTypeEnum.BISHOP));
				}
				if( knightNumber > 0 )
				{
					boardPieces.addAll(this.createBoardPieces(knightNumber, PieceTypeEnum.KNIGHT));
				}
				if( rookNumber > 0 )
				{
					boardPieces.addAll(this.createBoardPieces(rookNumber, PieceTypeEnum.ROOK));
				}
				ChessBoard cb = new ChessBoard(boardRow, boardColumns, boardPieces);
				logger.info(cb.toString());
			}
			long finalTime = System.currentTimeMillis();
			if( logger.isInfoEnabled() )
			{
				logger.info("Found "+uniqueCombinationsNumber+ " combinations in "+(finalTime-startTime)+" milliseconds");
			}
		} catch (Exception e)
		{
			String message = "Error while trying to print unique combinations; "+e.getMessage();
			logger.error(message, e);
			throw e;
		}
	}
	private List<AbstractPiece> createBoardPieces( int pieceNumber, PieceTypeEnum pieceType )
	{
		List<AbstractPiece> result = new ArrayList<AbstractPiece>(pieceNumber);
		switch (pieceType)
		{
		case KING:
			for(int i = 0; i<pieceNumber; i++)
			{
				result.add(new King("K"+(i+1), PieceTypeEnum.KING));
			}
			break;
		case QUEEN:
			for(int i = 0; i<pieceNumber; i++)
			{
				result.add(new Queen("Q"+(i+1), PieceTypeEnum.QUEEN));
			}
			break;
		case BISHOP:
			for(int i = 0; i<pieceNumber; i++)
			{
				result.add(new Bishop("B"+(i+1), PieceTypeEnum.BISHOP));
			}
			break;
		case ROOK:
			for(int i = 0; i<pieceNumber; i++)
			{
				result.add(new Rook("R"+(i+1), PieceTypeEnum.ROOK));
			}
			break;
		case KNIGHT:
			for(int i = 0; i<pieceNumber; i++)
			{
				result.add(new Knight("Kn"+(i+1), PieceTypeEnum.KNIGHT));
			}			
			break;			
		default:
			throw new IllegalArgumentException("No piece implementation found for piece type "+pieceType.name());
		}
		return result;
	}
}
