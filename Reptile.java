
public abstract class Reptile extends Animal
{
	/** Represents the average length of the feathers of this bird. */
	private boolean venomous;
	
	/** Create a new Reptile.
	 *  @param name A name to refer to this instance of Reptile.
	 *  @param weight The weight of this Reptile
	 *  @param age How old is this Reptile?
	 *  @param venomous Whether this reptile is venomous or not.
	 */
	public Reptile(String name, int weight, int age, boolean venomous)
	{
		super(name,weight,age);		// Invoke the Animal.Animal(int,int,int) constructor.
		
		this.venomous = venomous;
	}

	/** Returns a flag indicating whether this reptile is venomous. */
	public boolean isVenomous()
	{
		return venomous;
	}	
}