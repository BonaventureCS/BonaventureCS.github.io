/**
 * Defines a Student which is a Person with the addition of a gpa
 * 
 * @author andrianoff
 * @version 8 Feb 2012
 */
public class Student extends Person 
{
	private double gpa;
	
	/**
	 * Builds a Student from first name, last name, age, gender, and gpa
	 * @param f first name
	 * @param l last name
	 * @param a age
	 * @param ge gender
	 * @param gp gpa
	 */
	public Student(String f, String l, int a, char ge, double gp)
	{
		super(f, l, a, ge);
		gpa = gp;
	}
	
	/**
	 * Returns gpa
	 * @return gpa
	 */
	public double getGPA()
	{
		return gpa;
	}
	
	/**
	 * Returns a string representation of a Student
	 * @return a string representation of a Student
	 */
	public String toString()
	{
		return super.toString() + ", " + getGPA();
	}
	

}
