package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public interface Resposta {
	void responde(Requisicao req, ContaBancaria conta);
}
