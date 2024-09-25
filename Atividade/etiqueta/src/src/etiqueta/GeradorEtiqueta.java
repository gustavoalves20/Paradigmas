package etiqueta;

public class GeradorEtiqueta {
    public static String gerarEtiqueta(Produto produto) {
        return """
                ^XA
                ^CF0,60
                ^FO50,50^FD%s^FS
                ^CFA,50
                ^FO50,200^FDLata    %s^FS
                ^FO50,280^FDCaixa   %s^FS
                ^BY5,2,270
                ^FO100,450^BC^FD%s^FS
                ^XZ
                """.formatted(
                produto.getDescricao(),
                produto.getPrecoLata(),
                produto.getPrecoCaixa(),
                produto.getCodigoBarras()
        );
    }
}
