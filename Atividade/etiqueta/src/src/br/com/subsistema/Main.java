package br.com.subsistema;

import br.com.subsistema.factory.ImpostoFactory;
import br.com.subsistema.factory.TipoImposto;
import br.com.subsistema.imposto.Imposto;
import br.com.subsistema.model.Item;
import br.com.subsistema.model.Produto;
import br.com.subsistema.model.Servico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> produtos = new ArrayList<>();

        Imposto icms = ImpostoFactory.getImposto(TipoImposto.ICMS);
        Produto milho = new Produto();
        milho.setCodigo(1);
        milho.setDescricao("Milho");
        milho.setValor(100.0);
        milho.setIndustrial(false);
        milho.setImpostoCalculado(icms.calcular(milho));
        produtos.add(milho);

        Imposto ipi = ImpostoFactory.getImposto(TipoImposto.IPI);
        Produto carro = new Produto();
        carro.setCodigo(2);
        carro.setDescricao("Carro");
        carro.setValor(50000.0);
        carro.setIndustrial(true);
        carro.setImpostoCalculado(ipi.calcular(carro));
        produtos.add(carro);

        Imposto iss = ImpostoFactory.getImposto(TipoImposto.ISS);
        Servico consulta = new Servico();
        consulta.setCodigo(3);
        consulta.setDescricao("Consulta Médica");
        consulta.setValor(200.0);
        consulta.setImpostoCalculado(iss.calcular(consulta));
        produtos.add(consulta);

        Imposto pis = ImpostoFactory.getImposto(TipoImposto.PIS);
        Produto refrigerante = new Produto();
        refrigerante.setCodigo(4);
        refrigerante.setDescricao("Refrigerante");
        refrigerante.setValor(5.0);
        refrigerante.setIndustrial(true);  // Produto industrial
        refrigerante.setImpostoCalculado(pis.calcular(refrigerante));
        produtos.add(refrigerante);

        produtos.forEach(System.out::println);
    }
}