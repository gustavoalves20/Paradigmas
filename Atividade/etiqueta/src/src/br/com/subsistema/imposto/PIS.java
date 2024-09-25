package br.com.subsistema.imposto;

import br.com.subsistema.model.Item;
import br.com.subsistema.model.Produto;

public class PIS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item instanceof Produto ? item.getValor() * 0.0065 : 0;
    }
}
