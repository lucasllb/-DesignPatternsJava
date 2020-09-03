package templateMethod;

import java.util.ArrayList;
import java.util.List;

import strategyImpostos.Item;
import strategyImpostos.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.00;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getItens().size() * 0.01) * orcamento.getValor();
	}

}
