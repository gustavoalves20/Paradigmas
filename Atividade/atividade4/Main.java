import model.Carrinho;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continua = true;

        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        while (continua) {
            System.out.println("""
                1 -> Inserir item ao carrinho
                2 -> Ácrescimo de item
                3 -> Desconto de item
                4 -> Ácrescimo total
                5 -> Desconto total
                6 -> Finalizar venda    
        """);

            System.out.print("Escolha sua opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "0":
                    continua = false;
                    break;

                case "1":
                    try {
                        System.out.print("Diga o código do produto: ");
                        int codigo = numero.nextInt();

                        System.out.print("Diga a descrição do produto: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Diga o valor do produto: ");
                        double valor = numero.nextDouble();

                        carrinho.adicionarItem(codigo, descricao, valor);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "2":
                    try {
                        System.out.print("Diga o código do produto: ");
                        int codigo = numero.nextInt();

                        System.out.print("Diga o acréscimo de item: ");
                        double acrescimo = numero.nextDouble();
                        carrinho.acrescimoItem(codigo, acrescimo);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "3":
                    try {
                        System.out.print("Diga o código do produto: ");
                        int codigo = numero.nextInt();

                        System.out.print("Diga o desconto do produto: ");
                        double desconto = numero.nextDouble();
                        carrinho.descontoItem(codigo, desconto);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "4":
                    try {
                        System.out.print("Diga o acréscimo do produto: ");
                        double acrescimo = numero.nextDouble();
                        carrinho.acrescimoTotal(acrescimo);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "5":
                    try {
                        System.out.print("Diga o desconto do produto: ");
                        double desconto = numero.nextDouble();
                        carrinho.descontoTotal(desconto);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "6":
                    carrinho.finalizarCompra();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}