package br.com.itau.geradornotafiscal.handler.frete;

import br.com.itau.geradornotafiscal.model.Regiao;

public interface IFreteHandler {

    public double calcularFrete(Regiao regiao, double valorFrete);
}
