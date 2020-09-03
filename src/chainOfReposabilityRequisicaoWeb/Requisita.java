package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public class Requisita {
	
	public void requisicao(Requisicao req, ContaBancaria conta) {
		RespostaPorcento r3 = new RespostaPorcento(null);
		RespostaXML r2 = new RespostaXML(r3);
		RespostaCSV r1 = new RespostaCSV(r2);
		
		r1.responde(req, conta);
	}
}
