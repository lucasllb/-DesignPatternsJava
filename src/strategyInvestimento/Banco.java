package strategyInvestimento;
public class Banco {

	public void realizaInvestimento(ContaBancaria contaBancaria, Investimento investimento) {
		double retornoInvestimento = investimento.retonaInvestimento(contaBancaria);
		System.out.println(retornoInvestimento * 0.75 );
	}

}
