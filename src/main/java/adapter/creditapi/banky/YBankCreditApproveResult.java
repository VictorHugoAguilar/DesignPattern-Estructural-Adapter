package adapter.creditapi.banky;

/**
 * La clase representa la respuesta de la solicitud de crédito de YBank
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class YBankCreditApproveResult {

	private String approved;

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "YBankCreditApproveResult [approved=" + approved + "]";
	}
	
}
