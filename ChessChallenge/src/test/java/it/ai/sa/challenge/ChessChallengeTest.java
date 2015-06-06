package it.ai.sa.challenge;

import it.ai.sa.challenge.solution.CombinationPrinter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChessChallengeTest
{
	private static final Logger logger = LoggerFactory.getLogger(ChessChallengeTest.class.getName());
	@Test
	public void printCombinations()
	{
		try
		{
			CombinationPrinter cp = new CombinationPrinter();
			cp.printUniqueCombination(3, 3, 2, 0, 0, 1, 0);
		} catch (Exception e)
		{
			String message = "Error during test execution; "+e.getMessage();
			logger.error(message, e);
			throw e;
		}
	}
}
