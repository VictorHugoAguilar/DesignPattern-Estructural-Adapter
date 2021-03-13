package adapter_b;

/**
 * Client: Uses (and only knows) Target Interface
 * 
 * Crear una nueva clase que será el Adaptador, que extienda del componente
 * existente e implemente la interfaz obligatoria. De este modo se tiene la
 * funcionalidad que se quería y se cumple la condición de implementar la
 * interfaz.
 * 
 * La diferencia entre los patrones adaptador y fachada (facade) es que el
 * primero reutiliza una interfaz ya existente, mientras que el segundo define
 * una nueva con el objetivo de simplificarla.
 */
public class TestAdapterMain {

	public static void main(String[] args) {
		Guitar eGuitar = new ElectricGuitar();
		eGuitar.onGuitar();
		eGuitar.offGuitar();
		Guitar eAGuitar = new ElectricAcousticGuitar();
		eAGuitar.onGuitar();
		eAGuitar.offGuitar();

	}
}
