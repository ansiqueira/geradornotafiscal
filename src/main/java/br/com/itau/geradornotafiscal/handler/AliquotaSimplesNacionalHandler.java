package br.com.itau.geradornotafiscal.handler.pessoaJuridica;

import org.springframework.stereotype.Component;

@Component
public class AliquotaSimplesNacionalHandler implements IAliquotaPessoaJuridicaHandler {

    public double getAliquota(double valorTotalItens) {
        if (valorTotalItens < 1000) return 0.03;
        if (valorTotalItens <= 2000) return 0.07;
        if (valorTotalItens <= 5000) return 0.13;
        return 0.19;
    }
}
