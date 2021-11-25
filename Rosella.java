
/** Represents a Rosella, which is a smallish bird that comes in various colours. */
public class Rosella extends Bird
{
	/** The colour of this Rosella. There are several types around: Green, Yellow and Crimson. */
	private String colour;
	
	/** Create a new Rosella.
	 *  @param name The name that has been given to the Rosella by its owner.
	 *  @param age How old the Rosella is.
	 *  @param colour The colour of the bird. Various colours are found in nature.
	 */
	public Rosella(String name, int age, String colour)
	{
		// Invoke the Bird.Bird(String,int,int,int) constructor
		super(name,1,age,2);			// 1kg, 2cm feather length.
		
		this.colour = colour;
	}
	
	/** Makes the noise of a Kookaburra, to standard out. */
	@Override
	public void squawk()
	{
		System.out.println("klee klee");
	}
	
	/** Returns the colour of this Rosella's feathers. */
	@Override
	public String getFeatherColour()
	{
		return colour;
	}

	/** Returns a description of this Rosella object. */	
	@Override
	public String toString()
	{
		String description;
		description = "Rosella Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", featherLength=" + getFeatherLength();	// from Bird class
		description += ", colour=" + getFeatherColour();		// from Bird class, calls our version
		description += "]";
		return description;
	}
}