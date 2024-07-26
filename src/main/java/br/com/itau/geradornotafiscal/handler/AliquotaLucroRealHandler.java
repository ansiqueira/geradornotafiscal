package br.com.itau.geradornotafiscal.handler.pessoaJuridica;

import org.springframework.stereotype.Component;

@Component
public class AliquotaLucroRealHandler implements IAliquotaPessoaJuridicaHandler {

    public double getAliquota(double valorTotalItens) {
        if (valorTotalItens < 1000)  return 0.03;
        if (valorTotalItens <= 2000) return 0.09;
        if (valorTotalItens <= 5000) return 0.15;
        return 0.20;

    }
}
