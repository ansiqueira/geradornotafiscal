package br.com.itau.geradornotafiscal.exceptions;

public class RegistroException extends RuntimeException {

    public RegistroException(String message, Throwable cause ) {
        super(message, cause);
    }
}
