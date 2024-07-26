package br.com.itau.geradornotafiscal.handler.pessoaJuridica;

import br.com.itau.geradornotafiscal.model.RegimeTributacaoPJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AliquotaPessoaJuridicaFactory {

    private final AliquotaSimplesNacionalHandler simplesNacionalHandler;
    private final AliquotaLucroRealHandler lucroRealHandler;
    private final AliquotaLucroPresumidoHandler lucroPresumidoHandler;

    @Autowired
    public AliquotaPessoaJuridicaFactory(AliquotaSimplesNacionalHandler simplesNacionalHandler,
                                         AliquotaLucroRealHandler lucroRealHandler,
                                         AliquotaLucroPresumidoHandler lucroPresumidoHandler) {
        this.simplesNacionalHandler = simplesNacionalHandler;
        this.lucroRealHandler = lucroRealHandler;
        this.lucroPresumidoHandler = lucroPresumidoHandler;
    }

    public IAliquotaPessoaJuridicaHandler getHandler(RegimeTributacaoPJ regime) {
        switch (regime) {
            case SIMPLES_NACIONAL:
                return simplesNacionalHandler;
            case LUCRO_REAL:
                return lucroRealHandler;
            case LUCRO_PRESUMIDO:
                return lucroPresumidoHandler;
            default:
                throw new IllegalArgumentException("Regime tributário desconhecido");
        }
    }
}
