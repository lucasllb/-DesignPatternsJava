package strategyInvestimento;
import java.util.Random;

public class InvestimentoArrojado implements Investimento {

	@Override
	public double retonaInvestimento(ContaBancaria contaBancaria) {
		Random random = new Random();
		int numero = random.nextInt(100);
		double valor = 0.00;

		if (numero <= 20) {
			valor = contaBancaria.getValorConta() * 0.5;
		} else if (numero <= 30) {
			valor = contaBancaria.getValorConta() * 0.3;
		} else {
			valor = contaBancaria.getValorConta() * 0.6;
		}
		
		return valor;
	}

}
