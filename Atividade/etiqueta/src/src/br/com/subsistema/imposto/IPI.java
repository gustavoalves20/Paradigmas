package br.com.subsistema.imposto;

import br.com.subsistema.model.Item;
import br.com.subsistema.model.Produto;

public class IPI implements Imposto {
    @Override
    public double calcular(Item item) {
        return item instanceof Produto && ((Produto) item).isIndustrial() ? item.getValor() * 0.12 : 0;
    }
}
