/**
 * This program creates Terrestrial and Giant planets and tests their methods.
 * @author Blaine Parr
 * @version February 20, 2015
 * 
 * Revision History
 * v0.1:
 * - Created project and abstract Planet class.
 * 
 * v0.2:
 * - Finished the Planet class.
 * 
 * v0.3:
 * - Added interfaces.
 * 
 * v0.4:
 * - Created and finished the GiantPlanet class.
 * 
 * v0.5:
 * - Created and finished the TerrestrialPlanet class.
 * 
 * v1.0:
 * - Added Program class with main method.
 * - Finished the program.
 * - Finished internal documentation.
 * 
 * v1.1:
 * - Fixed missing comments.
 */
public class Program 
{
	public static void main(String[] args)
	{
		//Set up GiantPlanet saturn
		GiantPlanet saturn = new GiantPlanet("Saturn", 9.449, 95.2, "Gas");
		saturn.setMoonCount(62);
		saturn.setOrbitalPeriod(29.46);
		saturn.setRingCount(7);
		saturn.setRotationPeriod(0.43);
		
		System.out.println(saturn.toString()); //printout saturn's toString
		
		//Set up Terrestrial planet venus
		TerrestrialPlanet venus = new TerrestrialPlanet("Venus", 0.949, 0.82, false);
		venus.setMoonCount(0);
		venus.setOrbitalPeriod(0.62);
		venus.setRingCount(0);
		venus.setRotationPeriod(-243.02);
		
		System.out.println(venus.toString()); //printout venus's toString
	} //method main ends
} //class program ends
