package model;

import java.util.ArrayList;

public class Carrinho {
     ArrayList<Item> itens = new ArrayList<>();

     public void acrescimoTotal(double acrescimo) {
          if (acrescimo <= 0) {
               System.out.println("ERRO!");
               return;
          }

          double porProduto = acrescimo / itens.size();

          itens.forEach(item -> item.adicionarAcrescimo(porProduto));
     }
     public void descontoTotal(double desconto) {
          if (desconto <= 0) {
               System.out.println("ERRO!");
               return;
          }

          double porProduto = desconto / itens.size();

          itens.forEach(item -> item.adicionarDesconto(porProduto));
     }

     public void acrescimoItem(int codigo, double acrescimo) {
          if (acrescimo <= 0) {
               System.out.println("TU ERROU PALHAÇO!");
               return;
          }

          Item item = this.buscarProduto(codigo);

          if (item == null) {
               System.out.println("Item não encontrado!");
          }

          else {
              item.adicionarAcrescimo(acrescimo);
          }
     }

     public void descontoItem(int codigo, double desconto) {
          if (desconto <= 0) {
               System.out.println("TU ERROU PALHAÇO!");
               return;
          }

          Item item = this.buscarProduto(codigo);

          if (item == null) {
               System.out.println("Item não encontrado!");
          }

          else {
               item.adicionarDesconto(desconto);
          }
     }

     public Item buscarProduto(int codigo) {
          for (Item item: itens) {
               if (item.codigo == codigo) {
                    return item;
               }
          }
          return  null;
     }

     public void adicionarItem(int codigo, String descricao, double total) {
          Item item = buscarProduto(codigo);

          if (item == null) {
               itens.add(new Item(codigo, total, descricao));
          }
     }

     public void finalizarCompra() {
          System.out.println("Lista de Itens");
          itens.forEach(item -> System.out.println(item));

          double acrescimoTotal = 0;
          double descontoTotal = 0;
          double valorTotal = 0;

          for (Item item: itens) {
               acrescimoTotal += item.acrescimo;
               descontoTotal += item.desconto;
               valorTotal += item.total;
          }

          System.out.println("Desconto total: " + descontoTotal);
          System.out.println("Acréscimo total:" + acrescimoTotal);
          System.out.println("Valor total: " + valorTotal);
     }
}
