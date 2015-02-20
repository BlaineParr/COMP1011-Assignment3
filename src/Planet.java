/**
 * This class is abstract and acts as a base for a created planet. Subclasses can extend and
 * finish this class.
 * 
 * @author Blaine Parr
 * @version February 20, 2015
 */
public abstract class Planet 
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	//Getters and Setters/////////////////////////////////////////////////////////////////////////
	/**
	 * This method gets the diameter of the planet.
	 * @return The planet's diameter.
	 */
	public double getDiameter()
	{
		return _diameter;
	} //method getDiameter ends
	
	/**
	 * This method gets the mass of the planet.
	 * @return The planet's mass.
	 */
	public double getMass()
	{
		return _mass;
	} //method getMass ends

	/**
	 * This method gets the number of moons the planet has.
	 * @return The number of moons the planet has.
	 */
	public int getMoonCount() 
	{
		return _moonCount;
	} //method getMoonCount ends

	/**
	 * This method gets the name of the planet.
	 * @return The name of the planet.
	 */
	public String getName() 
	{
		return _name;
	} //method getName ends

	/**
	 * This method gets the orbital period of the planet.
	 * @return The orbital period of the planet.
	 */
	public double getOrbitalPeriod() 
	{
		return _orbitalPeriod;
	} //method getOrbitalPeriod ends

	/**
	 * This method get the number of rings the planet has.
	 * @return The number of rings the planet has.
	 */
	public int getRingCount()
	{
		return _ringCount;
	} //method getRingCount ends
	
	/**
	 * This method gets the rotation period of the planet.
	 * @return the rotation period of the planet.
	 */
	public double getRotationPeriod()
	{
		return _rotationPeriod;
	} //method getRotationPeriod ends
	
	/**
	 * This method sets the number of moons the planet has.
	 * @param moonCount The number of moons the planet has.
	 */
	public void setMoonCount(int moonCount) 
	{
		this._moonCount = moonCount;
	} //method setMoonCount ends
	
	/**
	 * This method sets the orbital period of the planet
	 * @param orbitalPeriod The orbital planet of the planet.
	 */
	public void setOrbitalPeriod(double orbitalPeriod) 
	{
		this._orbitalPeriod = orbitalPeriod;
	} //method setOrbitalPeriod ends

	/**
	 * This method sets the number of rings the planet has.
	 * @param ringCount The number of rings the planet has.
	 */
	public void setRingCount(int ringCount)
	{
		this._ringCount = ringCount;
	} //method setRingCount ends
	
	/**
	 * This method sets the rotation period of the planet.
	 * @param rotationPeriod The rotation period of the planet.
	 */
	public void setRotationPeriod(double rotationPeriod)
	{
		this._rotationPeriod = rotationPeriod;
	} //method setRotationPeriod ends
	
	//Constructor////////////////////////////////////////////////////////////////////////////////
	/**
	 * This constructor sets the name, diameter and mass of the planet.
	 * @param name The name of the planet.
	 * @param diameter The diameter of the planet.
	 * @param mass The mass of the planet.
	 */
	public Planet(String name, double diameter, double mass)
	{
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	} //constructor ends
	
	//Overridden Methods/////////////////////////////////////////////////////////////////////////
	public String toString()
	{
		//local variable to hold the planet's info
		String planetInfo = "Name: " + getName()
				+ "\nDiameter: " + getDiameter()
				+ "\nMass: " + getMass();
		return planetInfo;
	} //method toString ends
} //class Planet ends
