package strategyInvestimento;

public class ContaBancaria {
	private int numeroConta;
	private double valorConta;

	public ContaBancaria(int numeroConta, double valorConta) {
		this.numeroConta = numeroConta;
		this.valorConta = valorConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

}
