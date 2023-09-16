package org.example;

public class ElementNouFoundExeption extends RuntimeException {
    public ElementNouFoundExeption() {
    }

    public ElementNouFoundExeption(String message) {
        super(message);
    }

    public ElementNouFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNouFoundExeption(Throwable cause) {
        super(cause);
    }

    public ElementNouFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
