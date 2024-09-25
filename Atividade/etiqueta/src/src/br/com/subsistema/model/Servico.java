package br.com.subsistema.model;

public class Servico extends Item {
    public Servico(int codigo, String descricao, double preco, double impostoCalculado, double total) {
        super(codigo, descricao, preco, impostoCalculado, total);
    }

    public Servico() {
        super();
    }
}
