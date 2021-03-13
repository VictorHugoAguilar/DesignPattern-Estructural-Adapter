package adapter.impl;

/**
 * Clase que representa el request genérico utilizado por los adaptadores, éste
 * tendrá que ser convertido al requset del banco concreto
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class BankCreditRequest {

	private String customer;
	private double amount;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankCreditRequest [customer=" + customer + ", amount=" + amount + "]";
	}

}
