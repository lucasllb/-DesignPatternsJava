package strategyInvestimento;

public class RealizadorDeInvestimentos {

	private void realizaInvestimento(Investimento investimento, ContaBancaria contaBancaria) {
		double valorInvestimento = investimento.retonaInvestimento(contaBancaria);
		System.out.println(valorInvestimento);
	}
}
