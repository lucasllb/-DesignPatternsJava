package strategyImpostos;

public abstract class Imposto {

	protected final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	// construtor default
	public Imposto() {
		this.outroImposto = null;
	}

	protected double calculaOutroImposto(Orcamento orcamento) {
        return (outroImposto == null? 0 : outroImposto.calcula(orcamento));
    }

	public abstract double calcula(Orcamento orcamento);

}
