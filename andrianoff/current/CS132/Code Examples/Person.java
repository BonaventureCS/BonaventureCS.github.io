/**
 * Defines a person
 * 		Stores name, age, and gender
 * 		Provides the capability of increasing age
 * 
 * @author andrianoff
 * @version 5 Feb 2014
 */
public class Person 
{
	// private instance variables
	private String name;
	private int age;
	private char gender;
	
	// constructor
	/**
	 * Constructs a Person given name, age, and gender
	 * @param n name 
	 * @param a age of person
	 * @param g gender of person
	 */
	public Person(String n, int a, char g)
	{
		name = n;
		age = a;
		gender = g;
	}
	
	// getters
	/**
	 * Returns name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns age
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Returns gender
	 * @return gender
	 */
	public char getGender()
	{
		return gender;
	}
	
	/**
	 * Increases age by 1
	 */
	public void increaseAge()
	{
		age++;
	}
	
}
