
public abstract class Planet 
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotatationPeriod;
	
	//Getters and Setters/////////////////////////////////////////////////////////////////////////
	
	/**
	 * This method gets the diameter of the planet.
	 * @return the planets diameter.
	 */
	public double getDiameter()
	{
		return _diameter;
	} //method getDiameter ends
	
	/**
	 * This method gets the mass of the planet.
	 * @return
	 */
	public double getMass()
	{
		return _mass;
	} //method getMass ednds
} //class Planet ends
