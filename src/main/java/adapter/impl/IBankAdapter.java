package adapter.impl;

/**
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IBankAdapter {
	public BankCreditResponse sendCreditRequest(BankCreditRequest request);
}
