package adapter_b;

/**
 * Adapter/Wrapper: We Adapter/Wrapper AcousticGuitar into
 * ElectricAcousticGuitar to adapt into the Guitar Model
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class ElectricAcousticGuitar implements Guitar {
	
	AcousticGuitar acoustic = new AcousticGuitar();

	public void onGuitar() {
		acoustic.play();
	}

	public void offGuitar() {
		acoustic.leaveGuitar();
	}
}
