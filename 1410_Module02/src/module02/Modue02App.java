/**
 * 
 */
package module02;

/**
 * @author bjhow
 *
 */
public class Modue02App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PowerPlant plant1 = new PowerPlant(100);
		SolarPowerPlant plant2 = new SolarPowerPlant(200);
		HydroPowerPlant plant3 = new HydroPowerPlant(900, true);
		
		PowerPlant[] plants = {plant1, plant2, plant3};
		
		for (PowerPlant p : plants) {
			System.out.println(p);
			System.out.println(p.generateElectricity());
			
			if(p instanceof HydroPowerPlant) {
				System.out.println(((HydroPowerPlant) p).hasDam());
			}
		}
		
	}

}
