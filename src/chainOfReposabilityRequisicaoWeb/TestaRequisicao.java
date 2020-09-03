package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public class TestaRequisicao {

	public static void main(String[] args) {
		Requisicao req = new Requisicao(Formato.PORCENTO);
		ContaBancaria conta = new ContaBancaria(1, 150.00);
		
		Requisita requista = new Requisita();
		
		requista.requisicao(req, conta);
	}

}
