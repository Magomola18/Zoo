

public interface Amphibian extends LandCreature, WaterCreature
{
	/** Returns "Water" or "Land", to describe the preference of habitation for this 
	 *  amphibious animal. */
	public String getPreferenceForLandOrWater();
}