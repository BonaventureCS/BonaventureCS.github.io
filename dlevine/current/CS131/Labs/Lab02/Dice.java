/**	Class Dice
 * Encapsulation of methods for rolling an n-sided die, where
 * n is passed as an argument when a die is created. The default
 * value is 6.
 * 
 * @author S Andrianoff
 * @version 6 Sept 2010
 */

public class Dice
{
	private int sides;

	/**
	 * Constructor for a Dice object. Default of six sides.
	 *
	 */
	public Dice()
	{
		sides = 6;
	}
	
	/**
	 * Constructor for a Dice object.  Number of sides given.
	 * @param numSides number of sides of Dice
	 */
	public Dice(int numSides)
	{
		sides = numSides;
	}
	
	/**
	 * Roll the Dice and return result of roll.
	 * Returns a random integer between 1 and the number of sides. 
	 * @return result of roll
	 */
	public int roll()
	{
		double x;
		x = Math.random();
		return (int) Math.floor(x*sides) + 1;
	}
}
