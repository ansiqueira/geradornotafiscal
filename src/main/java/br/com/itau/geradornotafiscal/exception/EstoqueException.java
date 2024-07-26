package br.com.itau.geradornotafiscal.exceptions;

public class EstoqueException extends RuntimeException {

    public EstoqueException(String message, Throwable cause ) {
        super(message, cause);
    }
}
