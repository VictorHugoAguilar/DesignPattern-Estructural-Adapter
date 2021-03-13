package adapter.creditapi.bankx;

/**
 * Representa el request necesario para enivar una solicitud a XBank
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class XBankCreditRequest {

	private String customerName;
	private double requestAmount;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(double requestAmount) {
		this.requestAmount = requestAmount;
	}

	@Override
	public String toString() {
		return "XBankCreditRequest [customerName=" + customerName + ", requestAmount=" + requestAmount + "]";
	}

}
