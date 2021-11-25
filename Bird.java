

public abstract class Bird extends Animal
{
	/** Represents the average length of the feathers of this bird. */
	private int featherLength;
	
	public Bird(String name, int weight, int age, int featherLength)
	{
		super(name,weight,age);		// Invoke the Animal.Animal(int,int,int) constructor.
		this.featherLength = featherLength;
	}
	
	public final int getFeatherLength()
	{
		return featherLength;
	}
	
	/** This method should return a String describing the colour(s) of the feathers of this Bird. */
	public abstract String getFeatherColour();		// subclasses must implement.

	public abstract void squawk();		// Must be defined by each subclass.

	@Override
	public final void makeNoise()
	{								// This method is essentially applying the "Adapter Pattern"
		squawk();					// to change (adapt) the semantics of an inherited method (makeNoise)
	}								// to use the differently-named method of the subclasses (squawk)
}