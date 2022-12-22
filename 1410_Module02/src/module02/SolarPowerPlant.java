/**
 * A Solar Power Plant is a facility that generates power using the rays from the sun
 */
package module02;

/**
 * @author Brady H.
 *
 */
public class SolarPowerPlant extends PowerPlant {

	public SolarPowerPlant(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	public String generateElectricity() {
		return "generating electricity from the sun";
	}
	
}
