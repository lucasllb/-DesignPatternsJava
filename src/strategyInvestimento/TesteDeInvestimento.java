package strategyInvestimento;


public class TesteDeInvestimento {
	public static void main(String[] args) {
		Investimento investimentoArrojado = new InvestimentoArrojado();
		Investimento investimentoModerado = new InvestimentoModerado();
		Investimento investimentoConservador = new InvestimentoConservador();
		
		ContaBancaria conta = new ContaBancaria(1, 500);
		Banco banco = new Banco();
		
		banco.realizaInvestimento(conta, investimentoArrojado);
		banco.realizaInvestimento(conta, investimentoModerado);
		banco.realizaInvestimento(conta, investimentoConservador);
		
	}
}
