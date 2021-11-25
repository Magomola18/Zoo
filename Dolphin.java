
/** This class represents a Dolphin. A dolphin is primarily a Mammal, but is also
 *  a Water-based animal.
 */
public class Dolphin extends Mammal implements WaterCreature
{
	public Dolphin(String name, int weight, int age)
	{
		super(name,weight,age);
	}
	
	/** Returns a flag signifying whether this Dolphin can feed the provided mammal.
	 *  Hopefully, only a Dolphin will be provided as the parameter value!
	 */
	@Override
	public boolean feedYoung(Mammal otherMammal)		// Required by Mammal
	{
		// ensure parameter is a Dolphin
		if (otherMammal instanceof Dolphin)		
			return true;
		else
			return false;
	}
	
	/** Returns a number signifying the speed at which dolphins can travel in the water. */
	@Override
	public double getWaterSpeed()			// Required by WaterCreature
	{
		return 5;
	}
	
	/** Returns a description of this Dolphin object. */
	@Override
	public String toString()				// Over-riding the Animal version.
	{
		String description;
		description = "Dolphin Object: [name=" + getName();		// from Animal class
		description += ", age=" + getAge();						// from Animal class
		description += ", weight=" + getWeight();				// from Animal class
		description += ", waterSpeed=" + getWaterSpeed();		// from ourself.
		description += "]";
		return description;
	}
	
	/** Attempts to make a squeaky-barking noise for a dolphin's sound. */
	@Override
	public void makeNoise()				// Required by Animal class.
	{
		System.out.println("Eh Eh Eh Eh!");
	}
		
}