package br.com.itau.geradornotafiscal.handler;

public class AliquotaHandler implements IAliquotaHandler {

    @Override
    public double getAliquota(double valorItem) {
        if (valorItem < 500) return 0;
        if (valorItem <= 2000) return 0.12;
        if (valorItem <= 3500) return 0.15;
        return 0.17;
    }
}
