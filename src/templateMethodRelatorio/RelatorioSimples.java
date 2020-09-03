package templateMethodRelatorio;

import java.util.List;

import strategyInvestimento.ContaBancaria;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<ContaBancaria> contas) {
		for (ContaBancaria conta : contas) {
			System.out.println(conta.getNumeroConta() + " - " + conta.getValorConta());
		}
	}

}
