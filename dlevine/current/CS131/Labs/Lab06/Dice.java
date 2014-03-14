/**	Class Dice
	Encapsulation of methods for rolling an n-sided die, where
	n is passed as an argument when a die is created. The default
	value is 6.
	
	@author Robert Harlan
	@version 9/12/2009
*/

public class Dice
{
	/**
	 * Constructor for a Dice object. Default of six sides.
	 *
	 */
	public Dice()
	{
		this.mySides = 6;
	}//Dice
	
	/**
	 * Modify the number of sides of the object.
	 * @param numSides
	 */
	public Dice(int numSides)
	{
		this.mySides = numSides;
	}//Dice
	
	/**
	 * Get the number of sides
	 * @return int
	 */
	public int getSideCount()
	{
		return this.mySides;
	}// getSideCount
	
	/**
	 * Set the number of sides
	 * @param int
	 */
	public void setSideCount(int sides)
	{
		this.mySides = sides;
	}//setSideCount
	
	/**
	 * Return a random integer between 1 and the number of sides inclusive.
	 * @return int
	 */
	public int roll()
	{
		double x;
		x = Math.random();
		return (int) Math.floor(x*this.mySides) + 1;
	}//roll
	
	private int mySides;
}//class Dice
