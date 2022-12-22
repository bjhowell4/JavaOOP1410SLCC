/**
 * A Hydro Power Plant is a facility that generates power using water momentum
 */
package module02;

/**
 * @author Brady H.
 *
 */
public class HydroPowerPlant extends PowerPlant {

	private boolean dam;
	
	public HydroPowerPlant(int capacity, boolean dam) {
		super(capacity);
		this.dam = dam;
	}

	public boolean hasDam() {
		return dam;
	}
	
	public String generateElectricity() {
		return "generating electricity from water";
	}
	
}
