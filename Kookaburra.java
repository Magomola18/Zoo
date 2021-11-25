
/** Represents a Kookaburra, a medium sized Australian bird that laughs! */
public class Kookaburra extends Bird
{	
	/** Create a new Kookaburra.
	 *  @param name The name that has been given to the kookaburra by its owner.
	 *  @param age How old the kookaburra is.
	 */
	public Kookaburra(String name, int age)
	{
		// Invoke the Bird.Bird(String,int,int,int) constructor
		super(name,5,age,15);			// 5kg, 15cm feather length.
	}
	
	/** Makes the noise of a Kookaburra, to standard out. */
	@Override
	public void squawk()
	{
		System.out.println("Koo-kah-ka-ka-ka-ka-ka");
	}
	
	/** Returns the colour of this Kookaburra's feathers. All Kookaburras (in this system)
	 *  will be brown and white.
	 */
	@Override
	public String getFeatherColour()
	{
		return "Brown and White";
	}
	
	/** Returns a description of this Kookaburra object. */	
	@Override
	public String toString()
	{
		String description;
		description = "Kookaburra Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", featherLength=" + getFeatherLength();	// from Bird class
		description += ", colour=" + getFeatherColour();		// from Bird class, calls our local version
		description += "]";
		return description;
	}

}