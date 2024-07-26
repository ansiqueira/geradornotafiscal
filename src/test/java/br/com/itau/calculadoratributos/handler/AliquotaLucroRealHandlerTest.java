package br.com.itau.calculadoratributos.handler;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AliquotaLucroRealHandler {

    private final AliquotaLucroRealHandler aliquotaLucroRealHandler = new AliquotaLucroRealHandler();

    @ParameterizedTest
    @CsvSource({
            "500, 0.03",
            "1500, 0.09",
            "3000, 0.15",
            "6000, 0.20"
    })
    public void testHandleRequest(double valorTotalItens, double expectedAliquota) {
        double actualAliquota = aliquotaLucroRealHandler.handleRequest(valorTotalItens);
        assertEquals(expectedAliquota, actualAliquota);
    }
}
