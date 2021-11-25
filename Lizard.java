public class Lizard extends Reptile implements LandCreature
{
	/** Create a new Lizard.
	 *  @param name If you have named this lizard, supply its name here.
	 *  @param weight How heavy this lizard is.
	 *  @param age How old the lizard is.
	 */
	public Lizard(String name, int weight, int age)
	{
		super(name,weight,age,false);		// No lizard is venomous
	}

	/** Returns a description of this Lizard object. */
	@Override
	public String toString()
	{
		// Almost the same code as for the Snake.
		String description;
		description = "Lizard Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", isVenomous=" + isVenomous();			// from the Reptile class
		description += "]";
		return description;
	}
	
	/** Makes a funny sound. */
	@Override
	public void makeNoise()				// Required, by the Animal class.
	{
		System.out.println("HHHhhheee HHHHhhheee.");
	}
	
	/** Provides an implementation as required by the LandCreature interface. */
	@Override
	public double getLandSpeed()
	{
		return 7.4;					// (Some real-world lizards can get to very fast speeds)
	}
}