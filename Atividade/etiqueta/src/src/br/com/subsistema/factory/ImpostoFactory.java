package br.com.subsistema.factory;

import br.com.subsistema.imposto.*;

public class ImpostoFactory {
    public static Imposto getImposto(TipoImposto tipo) {
        return switch (tipo) {
            case ICMS -> new ICMS();
            case IPI -> new IPI();
            case ISS -> new ISS();
            case PIS -> new PIS();
        };
    }
}
