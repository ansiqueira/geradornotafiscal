package br.com.itau.geradornotafiscal.handler.frete;

import br.com.itau.geradornotafiscal.exception.FreteException;
import br.com.itau.geradornotafiscal.model.Regiao;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FreteHandler implements IFreteHandler {

    private final Map<Regiao, Double> percentuaisFrete;

    public FreteHandler() {
        this.percentuaisFrete = createFretePercentualMap();
    }

    @Override
    public double calcularFrete(Regiao regiao, double valorFrete) throws FreteException {
        Double percentual = percentuaisFrete.get(regiao);
        if (percentual != null) {
            return valorFrete * percentual;
        } else {
            throw new FreteException("Região não encontrada: " + regiao);
        }
    }

    private Map<Regiao, Double> createFretePercentualMap() {
        Map<Regiao, Double> map = new HashMap<>();
        map.put(Regiao.NORTE, 1.08);
        map.put(Regiao.NORDESTE, 1.085);
        map.put(Regiao.CENTRO_OESTE, 1.07);
        map.put(Regiao.SUDESTE, 1.048);
        map.put(Regiao.SUL, 1.06);
        return map;
    }
}
