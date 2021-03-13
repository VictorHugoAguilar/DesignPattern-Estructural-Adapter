package adapter;

import adapter.impl.BankCreditRequest;
import adapter.impl.BankCreditResponse;
import adapter.impl.IBankAdapter;
import adapter.impl.XBankCreditAdaptee;
import adapter.impl.YBankCreditAdaptee;

public class AdapterMain {

	public static void main(String[] args) {

		BankCreditRequest request = new BankCreditRequest();
		request.setCustomer("Victor Aguilar");
		request.setAmount(1000);

		IBankAdapter xBank = new XBankCreditAdaptee();
		BankCreditResponse xresponse = xBank.sendCreditRequest(request);
		System.out.println("xBankk approved > " + xresponse.isApproved() + "\n");

		IBankAdapter yBank = new YBankCreditAdaptee();
		BankCreditResponse yresponse = yBank.sendCreditRequest(request);
		System.out.println("yBank approved > " + yresponse.isApproved() + "\n");

		if (xresponse.isApproved()) {
			System.out.println("xBank aprovó su crédito, felicidades !!");
		} else if (yresponse.isApproved()) {
			System.out.println("yBank aprobó su crédito, felicidades !! ");
		} else {
			System.out.println("Lo sentimos su crédito no ha sido provado");
		}
	}
}
