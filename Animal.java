

/**
 *  An Animal is an object that is kept in a cage at the zoo.
 */
public abstract class Animal
{
	/** This represents the weight of the animal. */
	private int weight;

	/** This represents the age of the animal. */	
	private int age;
	
	/** This is the unique name of the animal, for example Elley, or Fido. */
	private String name;
	
	/** This will be the only possible way to set the name, initial weight and age
	 *  of all animals.
	 *  @param name The name desired for the instance of an animal subclass.
	 *  @param weight The initial weight of the instance.
	 *  @param age The current age of the animal represented by the instance.
	 */
	protected Animal(String name, int weight, int age)
	{
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	/** Returns the general weight of this Animal. */
	public final int getWeight()
	{
		return weight;
	}
	
	/** Returns the current age of this Animal. */
	public final int getAge()
	{
		return age;
	}
	
	/** Returns the name of this Animal, useful for the display boards outside the cage. */
	public final String getName()
	{
		return name;
	}
	
	/** Causes the animal to make its noise (once). */
	public abstract void makeNoise();		// Must be implemented by a subclass
	
	/** Provides a default description of the animal. Subclasses should override. */
	public String toString()
	{
		return "Animal Object: [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
}