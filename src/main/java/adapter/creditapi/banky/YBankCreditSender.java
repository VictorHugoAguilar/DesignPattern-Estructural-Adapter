package adapter.creditapi.banky;

/**
 * Clase que represneta la API que nos proporciona YBank para enviar las
 * solicitudes, esta tiene un método sendCreditForValidate, no regresa nada
 * (void) sin embargo recibe como parámetro una clase listener a la cual
 * notificará cuando tenga una respuesta lo que lo hace un servicio con
 * respuesta asíncrona, el metodo recibe como parámetro una clase llamada
 * YBankCreditApprove y el listener YBankCreditSenderListener.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class YBankCreditSender {

	public void sendCreditForValidate(final YBankCreditApprove request, final YBankCreditSenderListener listener) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(
						"YBank recibió la solicitud en un momento y tendra la respuesta, sea paciente por favor");
				YBankCreditApproveResult response = new YBankCreditApproveResult();
				if (request.getCredit() <= 1500) {
					response.setApproved("Y");
				} else {
					response.setApproved("N");
				}
				try {
					Thread.sleep(1000 * 3);
				} catch (Exception e) {
					e.printStackTrace();
				}
				listener.notifyCreditResult(response);
			}
		}).start();
	}

}
