// Week 5 DEMO program: The Zoo Animals Program
// This file defines the MAIN_DEMO class (a driver-class), and the 'start' class for program-entry-point.
// Author: Sheelagh
// Date: 15/8/2017


import java.util.Scanner;

class MAIN_DEMO
{
	private Animal[] zooAnimal;			// An array of Zoo Animals
	private int curAnimalIndex;			// The index of the animal currently being manipulated
	private Scanner scan;
	
	public MAIN_DEMO()
	{
		initializeArray();		// Create the array and populate it with some objects
		showAllAnimals();
		
		scan = new Scanner(System.in);
	}
	
	// Fills the zooAnimal array with animals, ready for manipulation.
	public void initializeArray()
	{
		zooAnimal = new Animal[10];			// We will make 10 animals:
		
		// Polymorphism allows us to assign an object of a subclass to an 
		// object reference to a superclass/ancestor.
		zooAnimal[0] = new Kookaburra("Kelly",5);		// A 5kg kookaburra
		zooAnimal[1] = new Lizard("Lizzy",2,3);			// A 2kg, 3-year-old lizard
		zooAnimal[2] = new Crocodile("Colin", 200, 7);		// a 7-yo 200kg croc.
		zooAnimal[3] = new Rosella("Katie", 2, "Crimson");		// a 2-yo Crimson Rosella
		zooAnimal[4] = new Rosella("Rosie", 4, "Green");		// a 4-yo Green Rosella
		zooAnimal[5] = new Snake("Boris","Brown",15,3);	// A Brown Snake, 15kg, 3 years
		zooAnimal[7] = new Snake("Rita","Rattle",22,1);	// A Rattle Snake, 22kg, 1 years
		zooAnimal[6] = new Dolphin("Dolly", 142, 6);	// A heavy, 6-yo dolphin.
		zooAnimal[8] = new Kookaburra("Kenneth",4);		// A 4kg kookaburra
		zooAnimal[9] = new Rosella("Yippy", 1, "Yellow");		// a 1-yo Yellow Rosella
	}
	
	public void showAllAnimals()
	{
		int i;
		System.out.println("==================");
		System.out.println("Animals of the array are: ");
		for (i = 0; i < zooAnimal.length; i++)
		{
			System.out.println("zooAnimal["+i+"] = " + zooAnimal[i]);
		}
	}
		
	boolean stillRunning;		// Whether or not main loop should continue to execute
	
	// Commence a loop of interactive user input.
	public void startRunning()
	{
		int menuChoice;
		
		curAnimalIndex = 0;
		
		stillRunning = true;
		while (stillRunning)
		{
			try {
				menuChoice = showMenuGetChoice();
			
				if (menuChoice == 0)
					stillRunning = false;
				else processChoice(menuChoice);
			} catch (Exception e)
			{
				System.err.println("An exception was caught by the startRunning method():"
				   + e.getMessage());
				e.printStackTrace(System.err);
			}			
		}
	}

	// Display top-level menu, and return the user's choice from it.
	public int showMenuGetChoice()
	{
		System.out.println("\n====================");
		System.out.println(zooAnimal[curAnimalIndex]);
		System.out.println("1. Change Current Animal (currently ["+curAnimalIndex+"])");
		System.out.println("2. Invoke the toString() method");
		System.out.println("3. Invoke the makeNoise() method");
		System.out.println("4. show fully-qualified name of class-type of object");
		System.out.println("5. try to treat as specific type...");
		System.out.println("0. Quit");
		
		return readInt(0,5);		// get user's choice and return this value
	}

	// Interpret the user's choice from the (top-level) menu.
	public void processChoice(int choice)
	{
		switch (choice)
		{
			case 1:
				changeCurrent();
				break;
			case 2:
				System.out.println(zooAnimal[curAnimalIndex]);
				break;
			case 3:
				zooAnimal[curAnimalIndex].makeNoise();
				break;
			case 4:
				System.out.println("Data type of object is "+
					zooAnimal[curAnimalIndex].getClass().getName()
				);
				break;
			case 5:
				treatAs(zooAnimal[curAnimalIndex]);
				break;
			default:
				System.out.println("Unanticipated command. Ignoring!");
				break;
		}
	}
	
	// Obtain an integer from the user, that must be within the given bounds.
	// lower and upper are permitted values. Will return the number once acceptable.
	public int readInt(int lower, int upper)
	{
		int value = -1;			// Invalid number in most cases where readInt is used.
		do {
			System.out.print("> ");
			value = scan.nextInt();
			scan.nextLine();			// just clears the input buffer, in case a string is to be read later.
		} while (value < lower || value > upper);
		return value;
	}
	
	// Asks the user which position of the array should be made the current manipulation target
	public void changeCurrent()
	{
		showAllAnimals();
		System.out.println("Which animal do you wish to manipulate (0-9)?");
		
		curAnimalIndex = readInt(0,9);
		System.out.println("Selected: " + zooAnimal[curAnimalIndex].getName());
	}
	
	// Provides another menu, where we can try to treat the supplied animal as a specific type.
	public void treatAs(Animal theAnimal)
	{
		System.out.println("Treat the animal as which type?");
		System.out.println("1. Bird [Abstract]");
		System.out.println("2. Reptile [Abstract]");
		System.out.println("3. Mammal [Abstract]");
		System.out.println("4. Kookaburra (Bird)");
		System.out.println("5. Rosella (Bird)");
		System.out.println("6. Snake (Reptile)");
		System.out.println("7. Crocodile (Reptile, Amphibian)");
		System.out.println("8. Lizard (Reptile)");
		System.out.println("9. Dolphin (Mammal, WaterCreature)");
		System.out.println("10. WaterCreature [Interface]");
		System.out.println("11. LandCreature [Interface]");
		System.out.println("12. Amphibian [Interface]");
		System.out.println("0. Back to Main Menu");
	
		switch(readInt(0,12))
		{
			case 1:
				treatAsBird(theAnimal);
				break;
			case 2:
				treatAsReptile(theAnimal);
				break;
			case 3:
				treatAsMammal(theAnimal);
				break;
			case 4:
				treatAsKookaburra(theAnimal);
				break;
			case 5:
				treatAsRosella(theAnimal);
				break;
			case 6:
				treatAsSnake(theAnimal);
				break;
			case 7:
				treatAsCrocodile(theAnimal);
				break;
			case 8:
				treatAsLizard(theAnimal);
				break;
			case 9:
				treatAsDolphin(theAnimal);
				break;
			case 10:
				treatAsWaterCreature(theAnimal);
				break;
			case 11:
				treatAsLandCreature(theAnimal);
				break;
			case 12:
				treatAsAmphibian(theAnimal);
				break;
			case 0:
				break;
			default:
				System.out.println("Unexpected choice. Ignoring.");			
		}
	}
	
	// Attempt to treat the Animal object as a Bird object.
	public void treatAsBird(Animal theAnimal)
	{
		int choice;
		try {
			Bird bird = (Bird) theAnimal;
			System.out.println("Animal is able to be treated as a Bird...");
			do {
				System.out.println("1. invoke the squawk() method");
				System.out.println("2. invoke the getFeatherColour() method");
				System.out.println("3. invoke the getFeatherLength() method");
				System.out.println("0. Main Menu");
				choice = readInt(0,3);
				if (choice != 0) switch (choice) {
					case 1:
						bird.squawk();
						break;
					case 2:
						System.out.println("The feather colour of this bird is "
						    + bird.getFeatherColour());
						break;
					case 3:
						System.out.println("The length of this birds feathers are "
						    + bird.getFeatherLength() + " cms");
						break;
				}
			} while (choice != 0);
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Bird object.");
		}
	}

	// Attempt to treat the Animal object as a Reptile object.
	public void treatAsReptile(Animal theAnimal)
	{
		int choice;
		
		if (theAnimal instanceof Reptile)
		{
			try {
				System.out.println("This animal is a Reptile.");
				
				// The following line first re-casts theAnimal to a Reptile (using the typecast)
				// It then applies the isVenomous method to the recasted object.
				if (  ((Reptile)theAnimal) .isVenomous())
					System.out.println("It is venomous");
				else
					System.out.println("It is not venomous");
			} catch (ClassCastException ccExc) {
				System.err.println("You cannot interpret that animal as a Reptile object.");
			}
		}
	}

	public void treatAsMammal(Animal theAnimal)
	{
		int choice;
		try {
			Mammal mammal = (Mammal) theAnimal;
			System.out.println("You are able to treat that animal as a Mammal object.");
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Mammal object.");
		}
	}

	public void treatAsKookaburra(Animal theAnimal)
	{
		int choice;
		try {
			Kookaburra kooky = (Kookaburra) theAnimal;
			System.out.println("Using a Kookaburra object reference...");
			System.out.println("kooky.getName() (from Animal) yields: " + kooky.getName());
			System.out.println("kooky.getFeatherColour() (from Bird) yields: " + kooky.getFeatherColour());
			System.out.println("kooky.toString() (from Object, overridden by Kookaburra) yields: " + kooky.toString());
			System.out.println("This kookaburra has something to say...");
			kooky.squawk();
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Kookaburra object.");
		}
	}

	public void treatAsRosella(Animal theAnimal)
	{
		int choice;
		if (theAnimal instanceof Rosella)
			System.out.println("This animal can be considered a Rosella");
		else
			System.out.println("Cannot typecast this animal to be a Rosella");
	}

	public void treatAsSnake(Animal theAnimal)
	{
		int choice;
		try {
			Snake snake = (Snake) theAnimal;
			System.out.println("This animal can be treated as a snake.");
			System.out.println("In actual fact, it is a "+ snake.getType() + " snake");
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Snake object.");
		}
	}

	public void treatAsLizard(Animal theAnimal)
	{
		int choice;
		try {
			Lizard liz = (Lizard) theAnimal;
			System.out.println("The animal is able to be considered as a Lizard.");
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Lizard object.");
		}
	}

	public void treatAsDolphin(Animal theAnimal)
	{
		int choice;
		try {
			Dolphin dolph = (Dolphin) theAnimal;
			System.out.println("The animal is able to be considered as a Dolphin.");
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as a Dolphin object.");
		}
	}

	public void treatAsCrocodile(Animal theAnimal)
	{
		int choice;
		try {
			Crocodile croc = (Crocodile) theAnimal;
			System.out.println("If I were you, I'd stay away from that Crocodile, and treat it as Dangerous!!!");
		} catch (ClassCastException ccExc) {
			System.err.println("Thankfully, you cannot treat that animal as a Crocodile object.");
		}
	}

	public void treatAsWaterCreature(Animal theAnimal)
	{
		int choice;
		try {
			WaterCreature wc;			// This declares an object reference that can
										// refer to objects that implement WaterCreature
			wc = (WaterCreature) theAnimal;			// Attempt to cast to WaterCreature
			
			// Call a WaterCreature-specific method:
			System.out.println("This animal is a Water Creature. It swims " 
				+ wc.getWaterSpeed() + " meters per second in the water!");
		} catch (ClassCastException ccExc) {
			System.err.println("That animal is not a WaterCreature.");
		}
	}

	public void treatAsLandCreature(Animal theAnimal)
	{
		int choice;
		try {
			LandCreature lc;			// This declares an object reference that can
										// refer to objects that implement LandCreature
			lc = (LandCreature) theAnimal;			// Attempt to cast to LandCreature
			
			// Call a LandCreature-specific method:
			System.out.println("This animal is a Land Creature. It can get up to speeds of " 
				+ lc.getLandSpeed() + " meters per second on land!");
		} catch (ClassCastException ccExc) {
			System.err.println("That animal is not a LandCreature.");
		}
	}

	public void treatAsAmphibian(Animal theAnimal)
	{
		int choice;
		try {
			Amphibian amphibian;	// Declares an object reference that can refer to any
									// objects that implement Amphibian.
			amphibian = (Amphibian) theAnimal;		// Attempt to make into Amphibian reference
			
			System.out.println("Yes, this animal is amphibious.");
			System.out.println("It prefers to stay most of the time in " +
				amphibian.getPreferenceForLandOrWater());
				
			System.out.println("On land, it can get up to speeds of " + 
			    amphibian.getLandSpeed() + " meters per second");
			System.out.println("and in the water, it can swim up to " +
				amphibian.getWaterSpeed() + " meters per second");
			
			
		} catch (ClassCastException ccExc) {
			System.err.println("You cannot interpret that animal as an Amphibian object.");
		}
	}
}