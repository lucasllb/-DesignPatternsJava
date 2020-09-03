package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public class RespostaPorcento implements Resposta {
	
	private Resposta proximo;
	
	@Override
	public void responde(Requisicao req, ContaBancaria conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			StringBuilder xml = new StringBuilder(conta.getNumeroConta()+"%"+conta.getValorConta());
			System.out.println(xml);
		} else {
			proximo.responde(req, conta);
		}
	}

	public RespostaPorcento(Resposta proximo) {
        this.proximo = proximo;
	}

}
