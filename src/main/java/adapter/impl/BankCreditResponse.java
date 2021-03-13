package adapter.impl;

/**
 * Clase que representa la respuesta genérica utilizada por los adaptadores.
 * Cuando el banco responda la olicitud de crédito lo hará con su propia clase
 * de respuesta definida en el API bancario, por lo cual esta respuesta deberá
 * ser convertida a esta clase con la finalidad de que siempre sea igual sin
 * importar el banco al cual se mandó la solicitud
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class BankCreditResponse {

	public boolean approved;

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "BankCreditResponse [approved=" + approved + "]";
	}

}
