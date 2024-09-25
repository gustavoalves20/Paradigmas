package br.com.subsistema.model;

public class Produto extends Item {
    private boolean industrial;

    public Produto(int codigo, String descricao, double preco, double impostoCalculado, double total, boolean industrial) {
        super(codigo, descricao, preco, impostoCalculado, total);
        this.industrial = industrial;
    }

    public Produto() {
        super();
    }

    public boolean isIndustrial() {
        return industrial;
    }

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }
}
