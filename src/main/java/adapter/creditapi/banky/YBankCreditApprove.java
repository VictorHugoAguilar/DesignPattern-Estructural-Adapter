package adapter.creditapi.banky;

/**
 * Clase que representa el request de YBank para la solicitud de crédito, la
 * clase recibe el name(nombre del cliente) y credit(la cantidad)
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class YBankCreditApprove {

	public String name;
	public float credit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "YBankCreditApprove [name=" + name + ", credit=" + credit + "]";
	}

}
