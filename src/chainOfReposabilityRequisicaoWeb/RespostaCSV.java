package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public class RespostaCSV implements Resposta {
	
	private Resposta proximo;
	
	@Override
	public void responde(Requisicao req, ContaBancaria conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			StringBuilder csv = new StringBuilder(conta.getNumeroConta()+","+conta.getValorConta());
			System.out.println(csv);
		} else {
			proximo.responde(req, conta);
		}
	}

	public RespostaCSV(Resposta proximo) {
        this.proximo = proximo;
	}

}
