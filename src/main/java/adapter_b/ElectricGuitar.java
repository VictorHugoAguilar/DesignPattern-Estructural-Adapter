package adapter_b;

/**
 * Direct Target Implementation: Already Adapted/Wrapped
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class ElectricGuitar implements Guitar {

	public void onGuitar() {
		System.out.println("Playing Guitar");
	}

	public void offGuitar() {
		System.out.println("I'm tired to play the guitar");
	}
}
