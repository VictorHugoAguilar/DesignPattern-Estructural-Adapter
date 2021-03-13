package adapter.creditapi.bankx;

/**
 * Clase para enviar las solicitudes de créditos
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class XBankCreditAPI {

	public XBankCreditResponse sendCreditRequest(XBankCreditRequest resquest) {
		XBankCreditResponse response = new XBankCreditResponse();
		if (resquest.getRequestAmount() <= 5000) {
			response.setAproval(true);
		} else {
			response.setAproval(false);
		}
		return response;
	}
}
