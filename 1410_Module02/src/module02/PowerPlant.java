/**
 * A Power Plant is a facility that generates power for cities
 */
package module02;

/**
 * @author Brady H.
 *
 */
public class PowerPlant {

	private int capacity;

	/**
	 * @param capacity
	 */
	public PowerPlant(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	public String generateElectricity() {
		return "generating electricity";
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + capacity + "MW";
	}
	
}
