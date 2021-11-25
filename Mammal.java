/** This class represents that an object is a mammal. */

public abstract class Mammal extends Animal
{

	public Mammal(String name, int weight, int age)
	{
		super(name,weight,age);				// Invokes Animal constructor.
	}

	/** All mammals can feed their young, preferably their own type!
	 *  @param otherMammal Another Mammal, preferably of the same subclass type,
	 *         being the animal to be fed.
	 *  @return true if the provided parameter is able to be fed (being same type).
	 */
	public abstract boolean feedYoung(Mammal otherMammal);
}