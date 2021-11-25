


/** Represents a Crocodile. A Crocodile is amphibious, i.e. it can both go in the water
 *  as well as go on the land. */
public class Crocodile extends Reptile implements Amphibian
{
	/** Create a new Lizard.
	 *  @param name If you have named this lizard, supply its name here.
	 *  @param weight How heavy this lizard is.
	 *  @param age How old the lizard is.
	 */
	public Crocodile(String name, int weight, int age)
	{
		super(name,weight,age,false);		// No lizard is venomous
	}

	/** Returns a description of this Lizard object. */
	@Override
	public String toString()
	{
		// Almost the same code as for the Snake.
		String description;
		description = "Crocodile Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", isVenomous=" + isVenomous();			// from the Reptile class
		description += ", landSpeed=" + getLandSpeed();			// from ourself.
		description += ", waterSpeed=" + getWaterSpeed();		// from ourself.
		description += "]";
		return description;
	}
	
	/** Makes a funny sound. */
	@Override
	public void makeNoise()				// Required, by the Animal class.
	{
		System.out.println("Snap Snap!");
	}
	
	/** Returns the speed at which the crocodile can move when on land. */
	@Override
	public double getLandSpeed()		// Required by being a LandCreature, and Amphibian.
	{
		return 1;			// Assume it can move 1 meter per second on land.
	}
	
	/** Returns the speed at which the crocodile can move when in the water. */
	@Override
	public double getWaterSpeed()		// Required by being a WaterCreature, and Amphibian.
	{
		return 2.5;			// Assume it can move up to 2.5 meters per second in water.
	}

	/** Returns "Water" for all crocodile objects. */
	@Override
	public String getPreferenceForLandOrWater()		// Required by virtue of implementing Amphibian
	{
		return "Water";			// I don't know if this is true, but they stay in water a lot!!!
	}
}