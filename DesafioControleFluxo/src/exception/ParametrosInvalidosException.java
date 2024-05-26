package exception;


public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parametro 1 deve ser menor que o parametro 2");
    }
}

