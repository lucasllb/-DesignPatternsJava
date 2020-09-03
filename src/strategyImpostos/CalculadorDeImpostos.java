package strategyImpostos;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double imp = imposto.calcula(orcamento);
		System.out.println(imp);
	}

}
