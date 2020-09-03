package strategyInvestimento;

public class InvestimentoModerado implements Investimento {

	@Override
	public double retonaInvestimento(ContaBancaria contaBancaria) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		double valor = 0.00;
		
		if (escolhido) {
			valor = contaBancaria.getValorConta() * 2.5;
		} else {
			valor = contaBancaria.getValorConta() * 0.7;
		}
		
		return valor;
	}

}
