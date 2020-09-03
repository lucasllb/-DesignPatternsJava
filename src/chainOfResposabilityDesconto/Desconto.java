package chainOfResposabilityDesconto;

import strategyImpostos.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
