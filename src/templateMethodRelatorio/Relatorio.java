package templateMethodRelatorio;

import java.util.List;

import strategyInvestimento.ContaBancaria;

public abstract class Relatorio {
	
	 protected abstract void cabecalho();
     protected abstract void rodape();
     protected abstract void corpo(List<ContaBancaria> contas);

     public void imprime(List<ContaBancaria> contas) {
       cabecalho();
       corpo(contas);
       rodape();
     }
	
}
