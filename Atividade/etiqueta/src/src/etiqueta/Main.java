package etiqueta;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("CERVEJA LARGE HEINEKEN", 6.0, 35.0, "78986683");
        String etiquetaZPL = GeradorEtiqueta.gerarEtiqueta(produto);

        System.out.println(etiquetaZPL);
    }
}