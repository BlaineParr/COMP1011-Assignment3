/**
 * This class is extended from the Planet superclass. It is used to create Gas and Ice Giant
 * planets.
 * @author Blaine Parr
 * @version February 20, 2015
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private String _type;
	
	/**
	 * This constructor sets the name, diameter, mass and type of the planet.
	 * @param name The name of the planet.
	 * @param diameter The diameter of the planet.
	 * @param mass The mass of the planet.
	 * @param type The type of planet. Either Gas or Ice.
	 */
	public GiantPlanet(String name, double diameter, double mass, String type) 
	{
		super(name, diameter, mass);
		_type = type;
	} //constructor ends

	//Overridden Methods//////////////////////////////////////////////////////////////////////////
	@Override
	public boolean hasMoons() 
	{
		return(this.getMoonCount() > 0? true : false);
	} //method hasMoons ends

	@Override
	public boolean hasRings() 
	{
		return(this.getRingCount() > 0? true : false);
	} //method hasRings ends
} //class GiantPlanet ends
