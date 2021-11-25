
public class Snake extends Reptile
{
	/** A description of the type of snake. */
	private String type;

	/** Create a new Snake.
	 *  @param name If you have named this snake, supply name here.
	 *  @param type What breed of snake this snake is.
	 *  @param weight If you know its weight (or approximate it)
	 *  @param age How old the snake is.
	 */
	public Snake(String name, String type, int weight, int age)
	{
		super(name,weight,age,true);		// Assume all snakes are venomous
		this.type = type;
	}
	
	/** Returns the type of snake that this snake is. */
	public String getType()
	{
		return type;
	}
	
	/** Returns a description of this Snake object. */
	@Override
	public String toString()
	{
		String description;
		description = "Snake Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", isVenomous=" + isVenomous();			// from the Reptile class
		description += ", type=" + getType();					// from ourself
		description += "]";
		return description;
	}
	
	/** Makes a Hissing sound. */
	@Override
	public void makeNoise()				// Required, by the Animal class.
	{
		System.out.println("SSSssss SSSsss.");
	}
}