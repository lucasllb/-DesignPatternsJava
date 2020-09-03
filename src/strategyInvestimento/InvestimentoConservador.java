package strategyInvestimento;

public class InvestimentoConservador implements Investimento {

	@Override
	public double retonaInvestimento(ContaBancaria contaBancaria) {
		return contaBancaria.getValorConta() * 0.8;
	}

}
