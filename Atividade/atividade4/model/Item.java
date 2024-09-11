package model;

public class Item {
    int codigo;
    double acrescimo;
    double desconto;
    double total;
    String descricao;

    public Item(int codigo, double total, String descricao) {
        this.codigo = codigo;
        this.acrescimo = 0;
        this.desconto = 0;
        this.total = total;
        this.descricao = descricao;
    }

    public void adicionarAcrescimo(double acrescimo) {
        this.acrescimo += acrescimo;
        this.total += acrescimo;
    }

    public void adicionarDesconto(double desconto) {
        this.desconto += desconto;
        this.total -= desconto;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo=" + codigo +
                ", acrescimo=" + acrescimo +
                ", desconto=" + desconto +
                ", total=" + total +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
