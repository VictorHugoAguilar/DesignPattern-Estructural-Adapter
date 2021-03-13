package adapter.creditapi.banky;

/**
 * Interface implementada para ser notificado cuando la respuesta asíncrona sea
 * envia por YBank
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface YBankCreditSenderListener {

	public void notifyCreditResult(YBankCreditApproveResult result);
}
