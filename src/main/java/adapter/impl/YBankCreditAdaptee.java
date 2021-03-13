package adapter.impl;

import adapter.creditapi.banky.YBankCreditApprove;
import adapter.creditapi.banky.YBankCreditApproveResult;
import adapter.creditapi.banky.YBankCreditSender;
import adapter.creditapi.banky.YBankCreditSenderListener;

/**
 * Esta clase sirve como adaptador entre el Cliente y el API, la clase hereda de
 * IBankAdapter con el fin de mantener una interface homologada entre el Cliente
 * y la Api, hereda de YBankCreditSenderListener para ser notificado cuando
 * YBank consteste de forma asíncrona.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class YBankCreditAdaptee implements IBankAdapter, YBankCreditSenderListener {

	private YBankCreditApproveResult yresponse;

	@Override
	public void notifyCreditResult(YBankCreditApproveResult result) {
		this.yresponse = result;
	}

	@Override
	public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
		YBankCreditApprove yrequest = new YBankCreditApprove();
		yrequest.setCredit((float) request.getAmount());
		yrequest.setName(request.getCustomer());

		YBankCreditSender sender = new YBankCreditSender();
		sender.sendCreditForValidate(yrequest, this);

		do {
			try {
				Thread.sleep(10000);
				System.out.println("YBank peticion en espera...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (yresponse == null);

		BankCreditResponse response = new BankCreditResponse();
		response.setApproved(yresponse.getApproved() == "Y");
		return response;
	}

}
