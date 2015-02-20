/**
 * This class is extended from the Planet superclass. It is used to create Terrestrial planets.
 * 
 * @author Blaine Parr
 * @version February 20, 2015
 */
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private boolean _oxygen;
	
	//Constructor/////////////////////////////////////////////////////////////////////////////////
	/**
	 * This constructor sets the name, diameter and mass of the planet and whether it has oxygen.
	 * @param name The name of the planet.
	 * @param diameter The diameter of the planet.
	 * @param mass The mass of the planet.
	 * @param oxygen Whether the planet has oxygen or not. True if it does, else false.
	 */
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen) 
	{
		super(name, diameter, mass);
		
		this._oxygen = oxygen;
	} //constructor ends

	//Overridden Methods//////////////////////////////////////////////////////////////////////////
	/**
	 * This method checks if the planet has moons.
	 * @return true if it has at least one moon, else false;
	 */
	@Override
	public boolean hasMoons() 
	{
		return(this.getMoonCount() > 0? true : false);
	} //method hasMoons ends
	
	/**
	 * This method checks if the planet is habitable.
	 * @return true if the planet has oxygen, else false.
	 */
	@Override
	public boolean habitable() 
	{
		return _oxygen;
	} //method habitable ends
} //class TerrestrialPlanet ends
