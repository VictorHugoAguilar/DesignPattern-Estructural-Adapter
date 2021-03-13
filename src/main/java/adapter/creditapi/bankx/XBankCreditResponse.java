package adapter.creditapi.bankx;

/**
 * Clase que representa la respuesta del XBank, si esta o no aprovado
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class XBankCreditResponse {

	public boolean aproval;

	public boolean isAproval() {
		return aproval;
	}

	public void setAproval(boolean aproval) {
		this.aproval = aproval;
	}

	@Override
	public String toString() {
		return "XBankCreditResponse [aproval=" + aproval + "]";
	}

}
