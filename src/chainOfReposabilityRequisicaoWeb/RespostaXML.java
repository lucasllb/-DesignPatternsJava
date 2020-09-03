package chainOfReposabilityRequisicaoWeb;

import strategyInvestimento.ContaBancaria;

public class RespostaXML implements Resposta {

	private Resposta proximo;

	@Override
	public void responde(Requisicao req, ContaBancaria conta) {
		if (req.getFormato().equals(Formato.XML)) {
			StringBuilder xml = new StringBuilder("<conta><titular>" + conta.getNumeroConta() + "</titular><saldo>"
					+ conta.getValorConta() + "</saldo></conta>");
			System.out.println(xml);
		} else {
			proximo.responde(req, conta);
		}
	}

	public RespostaXML(Resposta proximo) {
        this.proximo = proximo;
	}

}
