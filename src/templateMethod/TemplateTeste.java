package templateMethod;

import strategyImpostos.Item;
import strategyImpostos.Orcamento;

public class TemplateTeste {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(2.00);
		Item item1 = new Item("item", 1.0);
		Item item2 = new Item("a", 1.0);
		
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();
		
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(ihit.calcula(orcamento));
		
	}
}
