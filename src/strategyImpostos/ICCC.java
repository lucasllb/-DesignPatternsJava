package strategyImpostos;

public class ICCC extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double retorno = 0;
		if (orcamento.getValor() < 1000.00) {
			retorno = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() > 999.99 && orcamento.getValor() < 3000.01) {
			retorno = orcamento.getValor() * 0.07;
		} else if (orcamento.getValor() > 3000.00) {
			retorno = (orcamento.getValor() * 0.08) + 30.00;
		}
		return retorno;
	}

}
