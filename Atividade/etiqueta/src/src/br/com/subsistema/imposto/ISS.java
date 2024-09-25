package br.com.subsistema.imposto;

import br.com.subsistema.model.Item;
import br.com.subsistema.model.Servico;

public class ISS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item instanceof Servico ? item.getValor() * 0.22 : 0;
    }
}
